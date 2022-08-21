//Constructor
package com.aurionpro.model;

public class Rectangle {
	private double height;// instance variables
	private double width;
	private String color;

	public Rectangle(double height, double width, String color) {
//		this.height = height;
//		this.width = width;
//		this.color = color;
		this.height = validateValue(height);
		this.width = validateValue(width);
		this.color = validateColor(color);
	}
	
	public double getHeight() {
		return height;
	}

	public String getColor() {
		return color;
	}

	public double getWidth() {
		return width;
	}
	
	private String validateColor(String color) {
		
		if (color.equalsIgnoreCase("green"))
			return "green";
		if (color.equalsIgnoreCase("blue"))
			return "blue";
		return "red";

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
