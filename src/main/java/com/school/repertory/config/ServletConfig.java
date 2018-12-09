package com.school.repertory.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.school.repertory.filter.UrlFilter;
import com.school.repertory.filter.UserFilter;

@Configuration
public class ServletConfig {
	
	@Bean
	public UrlFilter urlFilter() {
		return new UrlFilter();
	}
	
	@Bean
	public FilterRegistrationBean<UrlFilter> urlFilterRegistrationBean() {
		FilterRegistrationBean<UrlFilter> registration = new FilterRegistrationBean<>();
		
		registration.setFilter(urlFilter());
		//过滤器名称
        registration.setName("urlFilter");
        //拦截路径
        registration.addUrlPatterns("/*");
        //设置顺序
        registration.setOrder(10);
        
        return registration;
	}
	
	@Bean
	public UserFilter userFilter() {
		return new UserFilter();
	}
	
	@Bean
	public FilterRegistrationBean<UserFilter> userFilterRegistrationBean() {
		FilterRegistrationBean<UserFilter> registration = new FilterRegistrationBean<>();
		
		registration.setFilter(userFilter());
		//过滤器名称
        registration.setName("userFilter");
        //拦截路径
        registration.addUrlPatterns("/*");
        //设置顺序
        registration.setOrder(2);
        
        return registration;
	}
}
