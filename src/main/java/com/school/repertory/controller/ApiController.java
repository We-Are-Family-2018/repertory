package com.school.repertory.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.school.repertory.controller.form.CustomerForm;
import com.school.repertory.controller.form.DeleteForm;
import com.school.repertory.controller.form.GoodsForm;
import com.school.repertory.controller.form.ImportForm;
import com.school.repertory.controller.form.InStorageForm;
import com.school.repertory.controller.form.OutStorageForm;
import com.school.repertory.controller.form.SearchCustomerForm;
import com.school.repertory.controller.form.SearchGoodsForm;
import com.school.repertory.controller.form.SearchInStorageRecordForm;
import com.school.repertory.controller.form.SearchInventoryForm;
import com.school.repertory.controller.form.SearchOutStorageRecordForm;
import com.school.repertory.controller.form.SearchSupplierForm;
import com.school.repertory.controller.form.SupplierForm;

@Controller
@RequestMapping("/repertory")
public class ApiController {

	@RequestMapping("/searchInventory")
	@ResponseBody
	public Object searchInventory(@Valid SearchInventoryForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/exportInventory")
	@ResponseBody
	public Object exportInventory(@Valid SearchInventoryForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/inStorage")
	@ResponseBody
	public Object inStorage(@Valid InStorageForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/searchInStorageRecord")
	@ResponseBody
	public Object searchInStorageRecord(@Valid SearchInStorageRecordForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/outStorage")
	@ResponseBody
	public Object outStorage(@Valid OutStorageForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/searchOutStorageRecord")
	@ResponseBody
	public Object searchOutStorageRecord(@Valid SearchOutStorageRecordForm form, BindingResult result) {
		return null;
	}
	
//	supplier
	@RequestMapping("/searchSupplier")
	@ResponseBody
	public Object searchSupplier(@Valid SearchSupplierForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/addSupplier")
	@ResponseBody
	public Object addSupplier(@Valid SupplierForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/editSupplier")
	@ResponseBody
	public Object editSupplier(@Valid SupplierForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/deleteSupplier")
	@ResponseBody
	public Object deleteSupplier(@Valid DeleteForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/importSupplier")
	@ResponseBody
	public Object importSupplier(@Valid ImportForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/exportSupplier")
	@ResponseBody
	public Object exportSupplier(@Valid SearchSupplierForm form, BindingResult result) {
		return null;
	}
	
//	customer
	@RequestMapping("/searchCustomer")
	@ResponseBody
	public Object searchCustomer(@Valid SearchCustomerForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/addCustomer")
	@ResponseBody
	public Object addCustomer(@Valid CustomerForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/editCustomer")
	@ResponseBody
	public Object editCustomer(@Valid CustomerForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/deleteCustomer")
	@ResponseBody
	public Object deleteCustomer(@Valid DeleteForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/importCustomer")
	@ResponseBody
	public Object importCustomer(@Valid ImportForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/exportCustomer")
	@ResponseBody
	public Object exportCustomer(@Valid SearchCustomerForm form, BindingResult result) {
		return null;
	}
	
//	goods
	@RequestMapping("/searchGoods")
	@ResponseBody
	public Object searchGoods(@Valid SearchGoodsForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/addGoods")
	@ResponseBody
	public Object addGoods(@Valid GoodsForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/editGoods")
	@ResponseBody
	public Object editGoods(@Valid GoodsForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/deleteGoods")
	@ResponseBody
	public Object deleteGoods(@Valid DeleteForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/importGoods")
	@ResponseBody
	public Object importGoods(@Valid ImportForm form, BindingResult result) {
		return null;
	}
	
	@RequestMapping("/exportGoods")
	@ResponseBody
	public Object exportGoods(@Valid SearchGoodsForm form, BindingResult result) {
		return null;
	}
}
