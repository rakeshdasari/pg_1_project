package com.pg.domain;

public class Category {

	private String categoryType;
	private double price;
	private String description;

	public Category(String categoryType, double price, String description) {
		super();
		this.categoryType = categoryType;
		this.price = price;
		this.description = description;
	}

	public Category() {
		super();
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
