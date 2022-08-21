package com.aurionpro.model;

public class ProductRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Created product");
	}

	@Override
	public void read() {
		System.out.println("Reading product");
	}

	@Override
	public void update() {
		System.out.println("Updating product");
	}

	@Override
	public void delete() {
		System.out.println("Deleted product");
	}

}
