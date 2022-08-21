package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle[] rectangles = {
				new Rectangle(100,10,ColorType.BLUE),
				new Rectangle(200,20,ColorType.RED),
				new Rectangle(300,30,ColorType.GREEN),
				new Rectangle(400,40,ColorType.BLUE),
				new Rectangle(500,50,ColorType.RED)
		};
		for(Rectangle r : rectangles) {
			printRectangle(r);
		}
	}

	private static void printRectangle(Rectangle rectangle) {
		System.out.println("Height is :" + rectangle.getHeight());
		System.out.println("Width is :" + rectangle.getWidth());
		System.out.println("Color is :" + rectangle.getColor());
		System.out.println("Area is :" + rectangle.calculateArea());
		System.out.println("-------------------");
	}
}
