
package com.aurionpro.model;

public class Rectangle {
	private double height;// instance variables
	private double width;
	private static int count;

	public Rectangle(double height, double width) {

		this.height = height;
		this.width = width;
		count += 1;
	}

	public static int getCount() {
		return count;
	}

	public Rectangle(double height) {
		this(height, 50);

	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double calculateArea() {
		// double area = height * width;//local variables
		return height * width;
	}

}
