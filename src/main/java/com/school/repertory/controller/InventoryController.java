package com.school.repertory.controller;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.school.repertory.controller.form.SearchInventoryForm;
import com.school.repertory.controller.view.InventoryView;
import com.school.repertory.controller.view.PageRespBody;
import com.school.repertory.dao.model.GoodsAndStorageModel;
import com.school.repertory.service.RepertoryService;

/**
 * 库存Controller
 *
 */
@Controller
@RequestMapping("/inventory")
public class InventoryController extends BaseController {
	@Autowired
	private RepertoryService repertoryService;
	
	@RequestMapping(value="/search-inventory")
	public String inventoryPage() {
		return "inventory";
	}
	
	@RequestMapping(value="/search-inventory-data")
	@ResponseBody
	public Object searchInventory(@Valid SearchInventoryForm form, BindingResult result) {
		ValidationResult vResult = validate(result);
		if (vResult.hasError()) {
			return PageRespBody.ERROR(vResult.getErrorMessage());
		}
		
		PageInfo<GoodsAndStorageModel> pages = repertoryService.searchInventory(form);
		List<InventoryView> views = pages.getList().stream()
				.map(x -> new InventoryView(x))
				.collect(Collectors.toList());
		
		return PageRespBody.OK(views, pages.getTotal());
	}
}
