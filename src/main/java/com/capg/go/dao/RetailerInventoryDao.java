package com.capg.go.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capg.go.entities.RetailInventoryDto;


public interface RetailerInventoryDao extends JpaRepository<RetailInventoryDto,String> {
	
	}

