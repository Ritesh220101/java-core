
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
		this.height = height;
		this.width = width;
		this.color = ColorType.RED;
	}
	
	public Rectangle(double height) {
		this.height = height;
		this.width = 10;
		this.color = ColorType.RED;
	}
	
	public Rectangle() {
		this.height = 1;
		this.width = 1;
		this.color = ColorType.GREEN;
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
