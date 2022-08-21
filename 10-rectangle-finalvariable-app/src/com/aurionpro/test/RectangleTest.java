package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle(100, -10,ColorType.BLUE);
		printRectangle(smallRectangle);

		System.out.println("---------------------");

		Rectangle bigRectangle = new Rectangle(300, 300,ColorType.GREEN);
		printRectangle(bigRectangle);
	}

	private static void printRectangle(Rectangle rectangle) {
		System.out.println("Height is :" + rectangle.getHeight());
		System.out.println("Width is :" + rectangle.getWidth());
		System.out.println("Color is :" + rectangle.getColor());
		System.out.println("Area is :" + rectangle.calculateArea());
	}
}
