package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle();
		setRectangleDetils(smallRectangle, 10, 20);

		printRectangle(smallRectangle);

		System.out.println("---------------------");

		Rectangle bigRectangle = new Rectangle();
		setRectangleDetils(bigRectangle, 100, 20);
		printRectangle(bigRectangle);;
		
	}

	private static void setRectangleDetils(Rectangle rectangle, int height, int width) {
		rectangle.setHeight(height);
		rectangle.setWidth(width);

	}

	private static void printRectangle(Rectangle rectangle) {
		System.out.println("Height is :" + rectangle.getHeight());
		System.out.println("Width is :" + rectangle.getWidth());
		System.out.println("Area is :" + rectangle.calculateArea());
	}
}
