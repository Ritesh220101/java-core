package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle(100, 10,ColorType.BLUE);
		printRectangle(smallRectangle);

		System.out.println("---------------------");

		Rectangle bigRectangle = new Rectangle(300, 300);
		printRectangle(bigRectangle);
		
		System.out.println("---------------------");
		
		Rectangle medRectangle = new Rectangle(150);
		printRectangle(medRectangle);
		
		System.out.println("---------------------");
		
		Rectangle r = new Rectangle();
		printRectangle(r);
	}

	private static void printRectangle(Rectangle rectangle) {
		System.out.println("Height is :" + rectangle.getHeight());
		System.out.println("Width is :" + rectangle.getWidth());
		System.out.println("Color is :" + rectangle.getColor());
		System.out.println("Area is :" + rectangle.calculateArea());
	}
}
