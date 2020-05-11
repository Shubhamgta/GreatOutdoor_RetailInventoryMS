package com.capg.go.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capg.go.bean.RetailerInventoryBean;
import com.capg.go.dao.RetailerInventoryDao;
import com.capg.go.entities.RetailInventoryDto;
import com.capg.go.exception.*;


@Service
@Transactional
public class RetailerInventoryServiceImpl implements RetailerInventoryService {
	
	@Autowired
	private RetailerInventoryDao dao;


	@Override
	public List<RetailInventoryDto> getListOfRetailers()  {
		List<RetailInventoryDto> list =dao.findAll();
		return list;
	}
	
	@Override
	public RetailInventoryDto getItemListByRetailer(String retailerId){
		Optional<RetailInventoryDto> optional=dao.findById(retailerId);
		if(optional.isPresent()) {
		RetailInventoryDto dto = optional.get();
		return dto;
		}
		throw new RetailerNotFoundExcetion("Retailer's ID Not Found");

	}
	@Override
	public boolean deleteItemInRetailerInventory(RetailInventoryDto inventoryDto) {
		
		Optional<RetailInventoryDto> optional= dao.findById(inventoryDto.getRetailerId());
		if(optional.isPresent()) {
			RetailInventoryDto dto=optional.get();
			dao.delete(dto);
			return true;
		}
		throw new RetailerNotFoundExcetion("Retailer Inventory Not Found");
		
	}

	@Override
	public RetailInventoryDto insertItemInRetailerInventory(RetailInventoryDto inventoryDto) {
		RetailInventoryDto dto=dao.save(inventoryDto);
		return dto;
	}


	

}
