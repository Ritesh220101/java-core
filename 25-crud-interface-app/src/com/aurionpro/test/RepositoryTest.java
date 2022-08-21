package com.aurionpro.test;

import com.aurionpro.model.CustomerRepository;
import com.aurionpro.model.IRepository;
import com.aurionpro.model.OrderRepository;
import com.aurionpro.model.ProductRepository;

public class RepositoryTest {

	public static void main(String[] args) {
		IRepository customer = new CustomerRepository();// always try to create the reference of the parent
		repositoryCrud(customer);

		IRepository order = new OrderRepository();
		repositoryCrud(order);

		IRepository product = new ProductRepository();
		repositoryCrud(product);

	}

	private static void repositoryCrud(IRepository repository) {
		repository.create();
		repository.read();
		repository.update();
		repository.delete();
		System.out.println("-------------------");

	}

}
