package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;

import com.aurionpro.model.LineItem;

public class LineItemSetTest {

	public static void main(String[] args) {
		Set<LineItem> items = new HashSet<LineItem>();
		items.add(new LineItem(1,"parle-g",3,10));
		items.add(new LineItem(1,"parle-g",5,10));
		items.add(new LineItem(4,"dark",10,30));
		items.add(new LineItem(2,"tiger",10,20));
		items.add(new LineItem(3,"h&s",7,25));
		items.add(new LineItem(4,"dark",6,30));
		
		int totalCartPrice = 0;
		for(LineItem item:items) {
			System.out.println(item);
			totalCartPrice +=(int) item.getTotalCost();
		}
		System.out.println("--------------------------------");
		System.out.println("Total cart price: "+totalCartPrice);
	}

}
