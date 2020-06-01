package com.capg.go.controller;


import java.util.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.capg.go.bean.DateUtil;
import com.capg.go.entities.RetailInventoryDto;
import com.capg.go.service.RetailerInventoryService;


@RestController
@RequestMapping("/inventories")
public class RetailerInventoryController {

	
	private static final Logger Log=LoggerFactory.getLogger(RetailerInventoryController.class);
	
	@Autowired
	private RetailerInventoryService service;
	
	@GetMapping("/{retailerId}")
	public ResponseEntity<List<RetailInventoryDto>> getInventoryByRetailerId(@PathVariable("retailerId")
																		String retailerId)
	{
		List<RetailInventoryDto> items = service.getItemListByRetailer(retailerId);
		ResponseEntity<List<RetailInventoryDto>> response= new ResponseEntity<>(items,HttpStatus.OK);
		return response;
		
	}
	@PostMapping("/add")
	public ResponseEntity<Boolean> add(@RequestBody Map<String,Object> requestData){
		
		
		RetailInventoryDto inventory=convert(requestData);
		System.out.println(inventory.toString());

		inventory=service.insertItemInRetailerInventory(inventory);
		System.out.println(inventory.toString());
		return new ResponseEntity<>(true,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/all")
	public ResponseEntity<List<RetailInventoryDto>>getInventories(){
//		String pattern="dd-MM-yyyy";
//        Date productSaleTimeDate = DateUtil.toDate(pattern, productSaleTimeStamp);
//        Date productRecieveTimeDate = DateUtil.toDate(pattern, productRecieveTimeStamp);
        
		List<RetailInventoryDto> list= service.getListOfRetailers();
		ResponseEntity<List<RetailInventoryDto>> response=new ResponseEntity<>(list,HttpStatus.OK);
		return response;
	}
	
	RetailInventoryDto convert(Map<String,Object>requestData) {
		
		String pattern="dd-MM-yyyy";
   Date productSaleTimeDate = DateUtil.toDate(pattern,(String) requestData.get("productSaleTimeDate"));
   Date productRecieveTimeDate = DateUtil.toDate(pattern,(String)  requestData.get("productRecieveTimeDate"));
		String retailerId=(String)requestData.get("retailerId");
		int productCategory= (int)requestData.get("productCategory");
		String productUniqueId=(String)requestData.get("productUniqueId");

		RetailInventoryDto entity = new RetailInventoryDto();
		entity.setRetailerId(retailerId);
		entity.setProductCategory(productCategory);
		entity.setProductUniqueId(productUniqueId);
		entity.setProductSaleTimeStamp(productSaleTimeDate);
		entity.setProductRecieveTimeStamp(productRecieveTimeDate);
		return entity;
	}
	
	
}
