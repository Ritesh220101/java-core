package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle(100, -10, "Green");
		printRectangle(smallRectangle);

		System.out.println("---------------------");

		Rectangle bigRectangle = new Rectangle(300, 300, "black");
		printRectangle(bigRectangle);
	}

	private static void printRectangle(Rectangle rectangle) {
		System.out.println("Height is :" + rectangle.getHeight());
		System.out.println("Width is :" + rectangle.getWidth());
		System.out.println("Color is :" + rectangle.getColor());
		System.out.println("Area is :" + rectangle.calculateArea());
	}
}
