package com.capg.go.controller;


import java.util.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.capg.go.entities.RetailInventoryDto;
import com.capg.go.service.RetailerInventoryService;








@RestController
@RequestMapping("/inventories")
public class RetailerInventoryController {

	
	private static final Logger Log=LoggerFactory.getLogger(RetailerInventoryController.class);
	
	@Autowired
	private RetailerInventoryService service;
	
	@GetMapping
	public ResponseEntity<List<RetailInventoryDto>> getInventoryByRetailerId(@PathVariable("retailerId")
																		String retailerId)
	{
		List<RetailInventoryDto> items = service.getItemListByRetailer(retailerId);
		ResponseEntity<List<RetailInventoryDto>> response= new ResponseEntity<>(items,HttpStatus.OK);
		return response;
		
	}
	@PostMapping("/add")
	public ResponseEntity<Boolean> add(@RequestBody Map<String,Object>requestData){
		
		RetailInventoryDto inventory=convert(requestData);
		inventory=service.insertItemInRetailerInventory(inventory);
		return new ResponseEntity<>(true,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/all")
	public ResponseEntity<List<RetailInventoryDto>>getInventories(){
		List<RetailInventoryDto> list= service.getListOfRetailers();
		ResponseEntity<List<RetailInventoryDto>> response=new ResponseEntity<>(list,HttpStatus.OK);
		return response;
	}
	
	RetailInventoryDto convert(Map<String,Object>requestData) {
		String retailerId=(String)requestData.get("retailerId");
		byte category= (Byte)requestData.get("category");
		RetailInventoryDto dto = new RetailInventoryDto();
		dto.setRetailerId(retailerId);
		dto.setProductCategory(category);
		return dto;
	}
	
	
}
