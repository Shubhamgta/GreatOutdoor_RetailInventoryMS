package com.capg.go.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.capg.go.bean.RetailerInventoryBean;
import com.capg.go.entities.RetailInventoryDto;
import com.capg.go.service.RetailerInventoryService;


@RestController
@RequestMapping("/retailers")
public class RetailerInventoryController {

	
	private static final Logger log=LoggerFactory.getLogger(RetailerInventoryController.class);
	
	@Autowired
	RetailerInventoryService service;
	
	@GetMapping
	public ResponseEntity<RetailInventoryDto>getRetailerInventoryById(@PathVariable("retailerId")
																		String retailerId)
	{
		RetailInventoryDto dto = service.getItemListByRetailer(retailerId);
		ResponseEntity<RetailInventoryDto> response= new ResponseEntity<>(dto,HttpStatus.OK);
		return response;
		
	}
	@GetMapping
	public ResponseEntity<List<RetailInventoryDto>>getRetailerList(){
		List<RetailInventoryDto> list= service.getListOfRetailers();
		ResponseEntity<List<RetailInventoryDto>> response=new ResponseEntity<>(list,HttpStatus.OK);
		return response;
	}
	
	public RetailerInventoryBean convertToBean(RetailInventoryDto dto) {
		RetailerInventoryBean bean =new RetailerInventoryBean();		
		bean.setRetailerId(dto.getRetailerId());
		bean.setProductUniqueId(dto.getProductUniqueId());
		bean.setProductCategoryNumber(dto.getProductCategory());
		return bean;
	}
	
	
}
