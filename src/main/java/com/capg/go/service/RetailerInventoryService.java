package com.capg.go.service;

import java.util.List;
import com.capg.go.entities.RetailInventoryDto;



public interface RetailerInventoryService {

	 RetailInventoryDto insertItemInRetailerInventory(RetailInventoryDto inventoryDto);
	
	boolean deleteItemInRetailerInventory(RetailInventoryDto inventoryDto);

	RetailInventoryDto getItemListByRetailer(String retailerId);
	
	List<RetailInventoryDto> getListOfRetailers();
}
