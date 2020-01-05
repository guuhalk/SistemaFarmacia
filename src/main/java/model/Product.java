package model;

import java.math.BigDecimal;

public class Product {
	private Integer idProduct;
	private String nameProduct;
	private Category idCategory;
	private Integer amountProduct;
	private BigDecimal priceProduct;
	private Integer statusProduct;

	// Getters and Setters
	public Integer getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public Category getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Category idCategory) {
		this.idCategory = idCategory;
	}

	public Integer getAmountProduct() {
		return amountProduct;
	}

	public void setAmountProduct(Integer amountProduct) {
		this.amountProduct = amountProduct;
	}

	public BigDecimal getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(BigDecimal priceProduct) {
		this.priceProduct = priceProduct;
	}

	public Integer getStatusProduct() {
		return statusProduct;
	}

	public void setStatusProduct(Integer statusProduct) {
		this.statusProduct = statusProduct;
	}

}
