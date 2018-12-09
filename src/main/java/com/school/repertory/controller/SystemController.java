package com.school.repertory.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.school.repertory.controller.form.LoginForm;
import com.school.repertory.utils.AesCipher;

@Controller
@RequestMapping("/system")
public class SystemController extends BaseController {

	@Autowired
	private AesCipher cipher;
	
	public String login(@Valid LoginForm form, BindingResult result, HttpServletRequest request, Model model) {
		ValidationResult vResult = validate(result);
		if (vResult.hasError()) {
			model.addAttribute("errMsg", vResult.getErrorMessage());
			return "system/login";
		}
		
		// 验证用户名密码
		
		// 验证通过，将用户名加密后保存在cookie中
		
		// 重定向页面
		
		return "redirect:/repertory/index";
	}
}
