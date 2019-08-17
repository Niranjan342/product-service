package com.app;

public class Product {
	
	private int productId;
	private String productName;
	private String productCost;
	private Model mob;
	public Product() {
		super();
	}
	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productCost
	 */
	public String getProductCost() {
		return productCost;
	}
	/**
	 * @param productCost the productCost to set
	 */
	public void setProductCost(String productCost) {
		this.productCost = productCost;
	}
	/**
	 * @return the mob
	 */
	public Model getMob() {
		return mob;
	}
	/**
	 * @param mob the mob to set
	 */
	public void setMob(Model mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", mob=" + mob + "]";
	}
	

}
