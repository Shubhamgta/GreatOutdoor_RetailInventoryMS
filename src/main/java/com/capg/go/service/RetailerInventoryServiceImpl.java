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
	public List<RetailInventoryDto> getItemListByRetailer(String retailerId){
		List<RetailInventoryDto> list =dao.findByRetailerId(retailerId);
		return list;
	}
	@Override
	public boolean deleteItemInRetailerInventory(RetailInventoryDto inventoryDto) {
		
		boolean exist= dao.existsById(inventoryDto.getRetailerId());
		if(!exist) {
			return false;
		}
		
		dao.deleteById(inventoryDto.getRetailerId());
		return true;
	}

	@Override
	public RetailInventoryDto insertItemInRetailerInventory(RetailInventoryDto inventoryDto) {
		RetailInventoryDto dto=dao.save(inventoryDto);
		return dto;
	}
	@Override
	public List<RetailInventoryDto> getSoldItemDetails(String retailerId){
		List<RetailInventoryDto> list=dao.getSoldItemDetails(retailerId);
		return list;
		
	}
	@Override
	public List<RetailInventoryDto> getDelieveredItemDetails(String retailerId){
		List<RetailInventoryDto> list=dao.getDelieveredItemDetails(retailerId);
		return list;
	}


	

}
