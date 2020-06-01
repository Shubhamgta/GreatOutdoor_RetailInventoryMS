package com.capg.go.entities;


import java.util.Date;
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
	private int productCategory;

	
	@Column(name = "PRODUCT_UIN", unique = true, nullable = false)
	private String productUniqueId;
	@Override
	public String toString() {
		return "RetailInventoryDto [inventoryId=" + inventoryId + ", retailerId=" + retailerId + ", productCategory="
				+ productCategory + ", productUniqueId=" + productUniqueId + ", productSaleTimeStamp="
				+ productSaleTimeStamp + ", productRecieveTimeStamp=" + productRecieveTimeStamp + "]";
	}

	@Temporal(TemporalType.DATE)
	private Date productSaleTimeStamp;
	@Temporal(TemporalType.DATE)
	private Date productRecieveTimeStamp;

	public Date getProductSaleTimeStamp() {
		return productSaleTimeStamp;
	}
	public void setProductSaleTimeStamp(Date productSaleTimeStamp) {
		this.productSaleTimeStamp = productSaleTimeStamp;
	}
	public Date getProductRecieveTimeStamp() {
		return productRecieveTimeStamp;
	}
	
	public void setProductRecieveTimeStamp(Date productRecieveTimeStamp) {
		this.productRecieveTimeStamp = productRecieveTimeStamp;
	}

	public String getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}

	public int getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(int productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductUniqueId() {
		return productUniqueId;
	}

	public void setProductUniqueId(String productUniqueId) {
		this.productUniqueId = productUniqueId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + inventoryId;
		result = prime * result + productCategory;
		result = prime * result + ((productRecieveTimeStamp == null) ? 0 : productRecieveTimeStamp.hashCode());
		result = prime * result + ((productSaleTimeStamp == null) ? 0 : productSaleTimeStamp.hashCode());
		result = prime * result + ((productUniqueId == null) ? 0 : productUniqueId.hashCode());
		result = prime * result + ((retailerId == null) ? 0 : retailerId.hashCode());
		return result;
	}

	public RetailInventoryDto () {
		this.inventoryId = 0;
		this.retailerId = null;
		this.productCategory =0;
		this.productUniqueId = null;
		this.productSaleTimeStamp =null;
		this.productRecieveTimeStamp =null;
	}

	public RetailInventoryDto(int inventoryId, String retailerId, int productCategory,
			String productUniqueId,Date productSaleTimeStamp, Date productRecieveTimeStamp) {
		this.inventoryId = inventoryId;
		this.retailerId = retailerId;
		this.productCategory = productCategory;
		this.productUniqueId = productUniqueId;
		this.productSaleTimeStamp = productSaleTimeStamp;
		this.productRecieveTimeStamp = productRecieveTimeStamp;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RetailInventoryDto other = (RetailInventoryDto) obj;
		if (inventoryId != other.inventoryId)
			return false;
		if (productCategory != other.productCategory)
			return false;
		if (productRecieveTimeStamp == null) {
			if (other.productRecieveTimeStamp != null)
				return false;
		} else if (!productRecieveTimeStamp.equals(other.productRecieveTimeStamp))
			return false;
		if (productSaleTimeStamp == null) {
			if (other.productSaleTimeStamp != null)
				return false;
		} else if (!productSaleTimeStamp.equals(other.productSaleTimeStamp))
			return false;
		if (productUniqueId == null) {
			if (other.productUniqueId != null)
				return false;
		} else if (!productUniqueId.equals(other.productUniqueId))
			return false;
		if (retailerId == null) {
			if (other.retailerId != null)
				return false;
		} else if (!retailerId.equals(other.retailerId))
			return false;
		return true;
	}
}
