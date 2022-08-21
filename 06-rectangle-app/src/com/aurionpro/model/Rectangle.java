//Getter and Setter
package com.aurionpro.model;

public class Rectangle {
	private double height;//instance variables
	private double width;
	
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double calculateArea() {
		//double area = height * width;//local variables
		return height * width;
	}
}
