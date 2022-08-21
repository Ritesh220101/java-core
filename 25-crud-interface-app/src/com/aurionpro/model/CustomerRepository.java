package com.aurionpro.model;

public class CustomerRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Created cutomer");
	}

	@Override
	public void read() {
		System.out.println("Reading customer");
	}

	@Override
	public void update() {
		System.out.println("Updating customer");
	}

	@Override
	public void delete() {
		System.out.println("Deleted customer");
	}

}
