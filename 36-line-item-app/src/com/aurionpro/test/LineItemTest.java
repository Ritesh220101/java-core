package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		
		ArrayList<LineItem> items = new ArrayList<>();
		items.add(new LineItem(101,"parle-g",3,15));
		items.add(new LineItem(102,"jam-jam",2,25));
		items.add(new LineItem(103,"krackjack",5,10));
		items.add(new LineItem(104,"dark",4,30));
		items.add(new LineItem(105,"h&s",6,20));
		
		double totalCartPrice = 0;
		for(LineItem item:items) {
			System.out.println("Total cost of "+item.getName()+" is "+item.getTotalCost());
			totalCartPrice +=item.getTotalCost();
		}
			
		System.out.println("--------------------------------");
		System.out.println("Total cart price: "+totalCartPrice);
	}

}
