package com.school.repertory.controller.view;

import com.school.repertory.dao.model.GoodsAndStorageModel;

public class InventoryView {
	private GoodsAndStorageModel model;
	
	public InventoryView(GoodsAndStorageModel model) {
		this.model = model;
	}
	
	public String getGoodsNo() {
		return model.getGoodsNo();
	}
	
	public String getGoodsName() {
		return model.getGoodsName();
	}
	
	public String getGoodsSize() {
		return String.format("%s×%s×%s", 
				model.getGoodsSizeLength().toString(), 
				model.getGoodsSizeWidth().toString(), 
				model.getGoodsSizeHeight().toString());
	}
	
	public String getGoodsValue() {
		return model.getGoodsValue().toString();
	}
	
	public String getCount() {
		return model.getStorageCount().toString();
	}
}
