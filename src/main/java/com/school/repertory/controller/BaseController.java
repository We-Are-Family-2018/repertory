package com.school.repertory.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

public abstract class BaseController {
	
	/**
	 * 根据BindingResult生成简化的Result对象
	 * @param result
	 * @return
	 */
	protected ValidationResult validate(BindingResult result) {
		StringBuilder builder = new StringBuilder();
		// 对象级错误
		if (result.hasGlobalErrors()) {
			for (ObjectError error : result.getGlobalErrors()) {
				builder.append(error.getDefaultMessage() + "; ");
			}
		}
		// 字段级错误
		if (result.hasFieldErrors()) {
			for (FieldError error : result.getFieldErrors()) {
				if (error.isBindingFailure()) {
					builder.append(error.getField() + ": " + "格式非法" + "; ");
				} else {
					builder.append(error.getField() + ": " + error.getDefaultMessage() + "; ");
				}
			}
		}
		
		return new ValidationResult(builder.toString());
	}
}
