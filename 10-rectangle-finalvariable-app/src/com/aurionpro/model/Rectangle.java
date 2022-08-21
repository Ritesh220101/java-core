
package com.aurionpro.model;

public class Rectangle {
	private final double height;// instance variables
	private final double width;
	private final ColorType color;

	public Rectangle(double height, double width, ColorType color) {
		this.color = color;
		this.height = validateValue(height);
		this.width = validateValue(width);
	}
	
//	cannot set the values to the final instance variables!!
//	public void setHeight(double height) {
//		this.height = height;
//	}
//	public void setWidth(double width) {
//		this.width = width;
//	}
//	public void setColor(ColorType color) {
//		this.color = color;
//	}
	public double getHeight() {
		return height;
	}

	public ColorType getColor() {
		return color;
	}

	public double getWidth() {
		return width;
	}
	
	private double validateValue(double value) {
		if (value <= 0)
			return 1;
		if (value > 100)
			return 100;
		return value;
	}

	public double calculateArea() {
		// double area = height * width;//local variables
		return height * width;
	}

	
}
