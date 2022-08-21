package com.aurionpro.model;

public class Product {
	private String id;
	private String description;
	private double amount;
	private double tax;
	private double discountPercent;

	public Product(String id, String description, double amount, float tax, double discountPercent) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
		this.discountPercent = discountPercent;
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getAmount() {
		return amount;
	}

	public double getTax() {
		return tax;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", description=" + description + ", amount=" + amount + ", tax=" + tax
				+ ", discountPercent=" + discountPercent + "]";
	}

}
