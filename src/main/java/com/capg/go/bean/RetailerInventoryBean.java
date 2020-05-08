package com.capg.go.bean;

public class RetailerInventoryBean {
	private String retailerId;
	private String retailerName;
	private byte productCategoryNumber;
	private String productCategoryName;
	private String productUniqueId;
	private String productName;
	public String getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}
	public String getRetailerName() {
		return retailerName;
	}
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}
	public byte getProductCategoryNumber() {
		return productCategoryNumber;
	}
	public void setProductCategoryNumber(byte productCategoryNumber) {
		this.productCategoryNumber = productCategoryNumber;
	}
	public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	public String getProductUniqueId() {
		return productUniqueId;
	}
	public void setProductUniqueId(String productUniqueId) {
		this.productUniqueId = productUniqueId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public RetailerInventoryBean () {
		this.retailerId = null;
		this.retailerName = null;
		this.productCategoryNumber = 0;
		this.productCategoryName = null;
		this.productUniqueId = null;
		
	}
	
	public RetailerInventoryBean(String retailerId, String retailerName, byte productCategoryNumber,
			String productCategoryName, String productUniqueId, String productName) {
		this.retailerId = retailerId;
		this.retailerName = retailerName;
		this.productCategoryNumber = productCategoryNumber;
		this.productCategoryName = productCategoryName;
		this.productUniqueId = productUniqueId;
		this.productName = productName;
		
	}
	
	
	
	
	
	
	

}
