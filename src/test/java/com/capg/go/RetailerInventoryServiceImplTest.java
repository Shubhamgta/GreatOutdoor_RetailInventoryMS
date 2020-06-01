package com.capg.go;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.capg.go.entities.RetailInventoryDto;
import com.capg.go.service.RetailerInventoryService;
import com.capg.go.service.RetailerInventoryServiceImpl;

@DataJpaTest
@ExtendWith(SpringExtension.class)
@Import(RetailerInventoryServiceImpl.class)
public class RetailerInventoryServiceImplTest {
	
	@Autowired
	private RetailerInventoryService service;
	
	@Autowired
	private EntityManager entityManager;
	
	@Test
	public void testGetListOfRetailers_1(){
		Date date = new Date();
		RetailInventoryDto item= new RetailInventoryDto();
		item.setInventoryId(101);
		item.setProductCategory((byte) 1);
		item.setProductRecieveTimeStamp(date);
		item.setProductSaleTimeStamp(date);
		item.setProductUniqueId("A01");
		item.setRetailerId("A1012");
		item=entityManager.merge(item);

		List<RetailInventoryDto> result= service.getListOfRetailers();
        System.out.println("************ result size="+result.size()+" *****************");
        Assertions.assertEquals(0,result.size());
        Assertions.assertFalse(result.contains(item));
		
	}
}
