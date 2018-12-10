package com.school.repertory.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.school.repertory.dao.model.SystemUser;
import com.school.repertory.service.SystemService;
import com.school.repertory.utils.AesCipher;
import com.school.repertory.utils.CipherEntity;

public class UserFilter implements Filter {
	private static final Logger LOG = LoggerFactory.getLogger(UserFilter.class);
	
	@Autowired
	private AesCipher cipher;
	
	@Autowired
	private SystemService systemService;
	
	public final static String USER_COOKIE_KEY = "r_user";

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		Cookie[] cookies = httpRequest.getCookies();
		String cookieValue = null;
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (USER_COOKIE_KEY.equals(cookie.getName())) {
					cookieValue = cookie.getValue();
					break;
				}
			}
		}
		
		if (cookieValue != null) {
			CookieUserInfo userInfo = null;
			try {
				String json = cipher.decrypt(CipherEntity.fromBase64Str(cookieValue));
				
				ObjectMapper mapper = new ObjectMapper();
				userInfo = mapper.readValue(json, CookieUserInfo.class);	
			} catch (Exception e) {
				LOG.info("读取用户信息失败。", e);
			}
			
			if (userInfo != null) {
				SystemUser user = systemService.findUser(userInfo.getUsername());
				request.setAttribute("user", user);
			}
		}

		chain.doFilter(httpRequest, response);
	}

	@Override
	public void destroy() {
		
	}

}
