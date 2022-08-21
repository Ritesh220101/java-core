
package com.aurionpro.model;

public class Rectangle {
	private double height;// instance variables
	private double width;
	private ColorType color;

	public Rectangle(double height, double width, ColorType color) {
		this.color = color;
		this.height = height;
		this.width = width;
	}
	
	public Rectangle(double height, double width) {
		this(height,width,ColorType.RED);
	}
	
	public Rectangle(double height) {
		this(height,10,ColorType.RED);
	}
	
	public Rectangle() {
		this(2,2,ColorType.BLUE);
	}
	
	public double getHeight() {
		return height;
	}

	public ColorType getColor() {
		return color;
	}

	public double getWidth() {
		return width;
	}

	public double calculateArea() {
		// double area = height * width;//local variables
		return height * width;
	}

	
}
