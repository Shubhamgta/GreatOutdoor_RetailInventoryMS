package com.capg.go.service;

import java.util.*;
import com.capg.go.bean.RetailerInventoryBean;
import com.capg.go.dao.RetailerInventoryDao;
import com.capg.go.entities.RetailInventoryDto;
import com.capg.go.exception.RetailerInventoryException;


public class RetailerInventoryServiceImpl implements RetailerInventoryService {
	RetailerInventoryDao dao;

	public RetailerInventoryServiceImpl(RetailerInventoryDao dao) {
		this.dao = dao;
	}

	@Override
	public List<RetailInventoryDto> getListOfRetailers()  {
		List<RetailInventoryDto> list = new ArrayList<>();
		list.addAll(dao.getListOfRetailers());
		return list;
	}
	
	@Override
	public List<RetailInventoryDto> getItemListByRetailer(RetailInventoryDto inventoryDto){
		List<RetailInventoryDto> list;
		return list;
		
		
	}
	@Override
	public void deleteItemInRetailerInventory(RetailInventoryDto inventoryDto) {
		
	}

	@Override
	public RetailInventoryDto insertItemInRetailerInventory(RetailInventoryDto inventoryDto) {
		RetailInventoryDto dto;
		return dto;
	}


	

}
