package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.Invoice;
import com.aurionpro.model.Product;

public class ProductTest {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("101", "milk", 50, 10, 5));//5t 2.5d//               52.5
		products.add(new Product("102", "tea", 100, 5, 10));//5t 10d//                95
		products.add(new Product("103", "biscuit", 75, 3, 5));//2.25t 3.75d//         73.5
		products.add(new Product("104", "oil", 150, 12, 10));//18t 15d//             153
		products.add(new Product("105", "maggi", 250, 30, 5));//75t 12.5d//          312.5
																				//   686.5
		Invoice in = new Invoice(products);
		System.out.println(in);
		
	}

}
