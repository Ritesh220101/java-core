package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle rect[] = {
				new Rectangle(10,20),
				new Rectangle(20,30),
				new Rectangle(39,40),
				new Rectangle(40,50),
				new Rectangle(50,60),
				new Rectangle(10)
		};
		Rectangle rectangle = new Rectangle(20);
		System.out.println("Number of objects: "+Rectangle.getCount());
	}
	
	
}
