package com.capg.go.service;

import java.util.List;
import com.capg.go.entities.RetailInventoryDto;



public interface RetailerInventoryService {

	 RetailInventoryDto insertItemInRetailerInventory(RetailInventoryDto inventoryDto);
	
	boolean deleteItemInRetailerInventory(RetailInventoryDto inventoryDto);

	List<RetailInventoryDto> getItemListByRetailer(String retailerId);
	
	List<RetailInventoryDto> getListOfRetailers();

	List<RetailInventoryDto> getSoldItemDetails(String retailerId);
	
	List<RetailInventoryDto> getDelieveredItemDetails(String retailerId);
}
