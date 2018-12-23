package com.school.repertory.controller.view;

public class RespBody {
	private int code;
	
	private String msg;
	
	private Object data;
	
	protected RespBody(int code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public static RespBody OK(Object data) {
		return new RespBody(0, "", data);
	}
	
	public static RespBody ERROR(String msg) {
		return new RespBody(1, msg, null);
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public Object getData() {
		return data;
	}
	
}
