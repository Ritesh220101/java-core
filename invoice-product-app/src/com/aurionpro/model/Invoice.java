package com.aurionpro.model;

import java.util.ArrayList;

public class Invoice {
	private ArrayList<Product> invoice;
	public double total;

	public Invoice(ArrayList<Product> products) {
		this.invoice = products;
		for (Product i : invoice) {
			this.total += calculateTotal(i);
		}
		printInvoice();

	}

	private void printInvoice() {
		for (Product i : invoice) {
			System.out.println("Id: " + i.getId());
			System.out.println("Description: " + i.getDescription());
			System.out.println("Amount: " + i.getAmount());
			System.out.println("Tax: " + calculateTax(i));
			System.out.println("Discount: " + calculateDiscount(i));
			System.out.println("Total: "+calculateTotal(i));
			System.out.println("---------------------");
		}
		
		System.out.println("Total bill: " + total);

	}

	private double calculateTax(Product i) {
		return (i.getAmount() * i.getTax()) / 100;

	}

	private double calculateDiscount(Product i) {
		return (i.getAmount() * i.getDiscountPercent()) / 100;

	}

	public double calculateTotal(Product i) {
		return i.getAmount() + calculateTax(i) - calculateDiscount(i);

	}

	@Override
	public String toString() {
		return "Invoice [invoice=" + invoice + ", total=" + total + "]";
	}
	

}
