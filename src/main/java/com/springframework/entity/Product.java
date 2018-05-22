package com.springframework.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "products")
@NamedQuery(name="findAllProducts",query="SELECT p FROM Product p")
public class Product implements Serializable {
	
	@Id
	@Column(name="productCode")
	private String productCode;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="productLine")
	private String productLine;
	
	@Column(name="productScale")
	private String productScale;
	
	@Column(name="productVendor")
	private String productVendor;
	
	@Column(name="productDescription")
	private String productDescription;
	
	@Column(name="quantityInStock")
	private Long qtyInStock;
	
	@Column(name="buyPrice")
	private Double buyPrice;
	
	@Column(name="MSRP")
	private Double mSRP;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getProductScale() {
		return productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	public String getProductVendor() {
		return productVendor;
	}

	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Long getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(Long qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Double getmSRP() {
		return mSRP;
	}

	public void setmSRP(Double mSRP) {
		this.mSRP = mSRP;
	}

}
