package com.capg.go.entities;


import java.util.Calendar;

import javax.persistence.*;


@Entity
@Table(name = "RETAILER_INVENTORY")
public class RetailInventoryDto {
	
	@Id
	@GeneratedValue
	private int inventoryId;
	
	
	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	@Column(name = "RETAILER_ID", unique = false, nullable = false)
	private String retailerId;

	@Column(name = "PRODUCT_CATEGORY", unique = false, nullable = false)
	private byte productCategory;

	
	@Column(name = "PRODUCT_UIN", unique = true, nullable = false)
	private String productUniqueId;
	private Calendar productSaleTimeStamp;
	private Calendar productRecieveTimeStamp;

	public Calendar getProductSaleTimeStamp() {
		return productSaleTimeStamp;
	}

	public void setProductSaleTimeStamp(Calendar productSaleTimeStamp) {
		this.productSaleTimeStamp = productSaleTimeStamp;
	}

	public Calendar getProductRecieveTimeStamp() {
		return productRecieveTimeStamp;
	}

	public void setProductRecieveTimeStamp(Calendar productRecieveTimeStamp) {
		this.productRecieveTimeStamp = productRecieveTimeStamp;
	}

	public String getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}

	public byte getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(byte productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductUniqueId() {
		return productUniqueId;
	}

	public void setProductUniqueId(String productUniqueId) {
		this.productUniqueId = productUniqueId;
	}
	public RetailInventoryDto() {

	}

	public RetailInventoryDto(String retailerId, byte productCategory, String productUniqueId,
			Calendar productSaleTimeStamp,Calendar productRecieveTimeStamp) {
		this.retailerId = retailerId;
		this.productCategory = productCategory;
		this.productUniqueId = productUniqueId;
		this.productSaleTimeStamp= productSaleTimeStamp;
		this.productRecieveTimeStamp= productRecieveTimeStamp;
		
	}

	
}
