package com.capg.go.service;

import java.util.List;
import com.capg.go.entities.RetailInventoryDto;



public interface RetailerInventoryService {

	 RetailInventoryDto insertItemInRetailerInventory(RetailInventoryDto inventoryDto);
	
	void deleteItemInRetailerInventory(RetailInventoryDto inventoryDto);

	List<RetailInventoryDto> getItemListByRetailer(RetailInventoryDto inventoryDto);
	
	List<RetailInventoryDto> getListOfRetailers();
}
