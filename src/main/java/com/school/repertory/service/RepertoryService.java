package com.school.repertory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.school.repertory.controller.form.SearchInventoryForm;
import com.school.repertory.dao.mapper.GoodsStorageMapper;
import com.school.repertory.dao.model.GoodsAndStorageModel;

@Service
public class RepertoryService {
	@Autowired
	private GoodsStorageMapper storageMapper;
	
	public PageInfo<GoodsAndStorageModel> searchInventory(SearchInventoryForm form) {
		PageHelper.startPage(form.getPage(), form.getLimit());
		List<GoodsAndStorageModel> res = storageMapper.selectGoodsAndStorage(form);
		PageInfo<GoodsAndStorageModel> pageInfo = new PageInfo<>(res);
		return pageInfo;
	}
}
