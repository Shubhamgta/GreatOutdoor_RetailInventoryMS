package com.capg.go.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.capg.go.entities.RetailInventoryDto;


public interface RetailerInventoryDao extends JpaRepository<RetailInventoryDto,String> {
	List<RetailInventoryDto> findByRetailerId(String retailerId);
	
	@Query("from RetailInventoryDto where retailerId=rid and productSaleTimeStamp!=null")
	List<RetailInventoryDto> getSoldItemDetails(@Param("rid")String retailerId);
	
	@Query("from RetailInventoryDto where retailerId=rid and productRecieveTimeStamp!=null")
	List<RetailInventoryDto> getDelieveredItemDetails(String retailerId);
	
	
	
	}

