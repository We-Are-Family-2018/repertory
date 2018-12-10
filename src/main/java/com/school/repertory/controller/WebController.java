package com.school.repertory.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.school.repertory.controller.form.LoginForm;
import com.school.repertory.dao.model.SystemUser;
import com.school.repertory.filter.CookieUserInfo;
import com.school.repertory.filter.UserFilter;
import com.school.repertory.service.SystemService;
import com.school.repertory.utils.AesCipher;
import com.school.repertory.utils.CipherEntity;

@Controller
public class WebController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(WebController.class);
	
	@Autowired
	private AesCipher cipher;
	
	@Autowired
	private SystemService systemService;
	
	@RequestMapping(value="/index")
	public String index(@RequestAttribute(name="user", required=false) SystemUser user, Model model) {
		if (user == null) {
			return "redirect:/login";
		}
		
		model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginSubmit(@Valid LoginForm form, BindingResult result, HttpServletResponse response, Model model) throws JsonProcessingException {
		// 表单验证
		ValidationResult vResult = validate(result);
		if (vResult.hasError()) {
			model.addAttribute("errMsg", vResult.getErrorMessage());
			model.addAttribute("form", form);
			return "login";
		}
		
		// 验证用户名密码
		SystemUser user = systemService.authUser(form.getUsername(), form.getPassword());
		if (user == null) {
			model.addAttribute("errMsg", "用户名密码错误");
			return "login";
		}
		
		// 验证通过，将用户信息加密后保存在cookie中
		CookieUserInfo cookieUserInfo = new CookieUserInfo();
		cookieUserInfo.setUsername(user.getUserUsername());
		ObjectMapper mapper = new ObjectMapper();
		String userInfo = mapper.writeValueAsString(cookieUserInfo);
		CipherEntity entity = cipher.encrypt(userInfo);
		Cookie cookie = new Cookie(UserFilter.USER_COOKIE_KEY, entity.toBase64Str());
		cookie.setMaxAge(3600);
		response.addCookie(cookie);
		
		// 重定向页面
		return "redirect:/index";
	}
	
	@RequestMapping(value="/500")
	public String serverError() {
		return "500";
	}
	
	@ExceptionHandler
	public String exception(Throwable exception) {
		LOG.warn("服务器内部异常。", exception);
		return "redirect:/500";
	}
}
