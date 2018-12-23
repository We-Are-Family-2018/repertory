package com.school.repertory.controller.view;

public class PageRespBody extends RespBody {
	private long count;
	
	protected PageRespBody(int code, String msg, Object data, long count) {
		super(code, msg, data);
		this.count = count;
	}

	public static PageRespBody OK(Object data, long totalCount) {
		return new PageRespBody(0, "", data, totalCount);
	}
	
	public static PageRespBody ERROR(String msg) {
		return new PageRespBody(1, msg, null, 0);
	}
	
	public long getCount() {
		return count;
	}
}
