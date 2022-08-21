package com.aurionpro.model;

public class OrderRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Created object");
	}

	@Override
	public void read() {
		System.out.println("Reading object");
	}

	@Override
	public void update() {
		System.out.println("Updating object");
	}

	@Override
	public void delete() {
		System.out.println("Deleted object");
	}

}
