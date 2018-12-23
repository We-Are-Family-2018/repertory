package com.school.repertory.controller.form;

import java.math.BigDecimal;

public class SearchInventoryForm extends PageForm {
	private String goodsNo;
	
	private String goodsName;
	
	private BigDecimal goodsLength;
	
	private BigDecimal goodsWidth;
	
	private BigDecimal goodsHeight;
	
	private BigDecimal goodsValueMin;
	
	private BigDecimal goodsValueMax;
	
	private Integer countMin;
	
	private Integer countMax;

	public String getGoodsNo() {
		return goodsNo == null ? goodsNo : goodsNo.trim();
	}

	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}

	public String getGoodsName() {
		return goodsName == null ? goodsName : goodsName.trim();
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public BigDecimal getGoodsLength() {
		return goodsLength;
	}

	public void setGoodsLength(BigDecimal goodsLength) {
		this.goodsLength = goodsLength;
	}

	public BigDecimal getGoodsWidth() {
		return goodsWidth;
	}

	public void setGoodsWidth(BigDecimal goodsWidth) {
		this.goodsWidth = goodsWidth;
	}

	public BigDecimal getGoodsHeight() {
		return goodsHeight;
	}

	public void setGoodsHeight(BigDecimal goodsHeight) {
		this.goodsHeight = goodsHeight;
	}

	public BigDecimal getGoodsValueMin() {
		return goodsValueMin;
	}

	public void setGoodsValueMin(BigDecimal goodsValueMin) {
		this.goodsValueMin = goodsValueMin;
	}

	public BigDecimal getGoodsValueMax() {
		return goodsValueMax;
	}

	public void setGoodsValueMax(BigDecimal goodsValueMax) {
		this.goodsValueMax = goodsValueMax;
	}

	public Integer getCountMin() {
		return countMin;
	}

	public void setCountMin(Integer countMin) {
		this.countMin = countMin;
	}

	public Integer getCountMax() {
		return countMax;
	}

	public void setCountMax(Integer countMax) {
		this.countMax = countMax;
	}
}
