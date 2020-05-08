package com.capg.go.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "RETAILER_INVENTORY")
public class RetailInventoryDto {
	
	@Id
	String inventoryId;
	
	@Column(name = "RETAILER_ID", unique = false, nullable = false)
	private String retailerId;

	@Column(name = "PRODUCT_CATEGORY", unique = false, nullable = false)
	private byte productCategory;

	
	@Column(name = "PRODUCT_UIN", unique = true, nullable = false)
	private String productUniqueId;

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

	public RetailInventoryDto(String retailerId, byte productCategory, String productUniqueId) {
		this.retailerId = retailerId;
		this.productCategory = productCategory;
		this.productUniqueId = productUniqueId;
		
	}

	
}
