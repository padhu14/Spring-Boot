package com.springframework.dto;

public class ProductDTO {
	private String productCode;
	private String productName;
	private String productLine;
	private String productScale;
	private String productVendor;
	private String productDescription;
	private Long qtyInStock;
	private Double buyPrice;
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

	public Double getMSRP() {
		return mSRP;
	}

	public void setMSRP(Double mSRP) {
		this.mSRP = mSRP;
	}

}
