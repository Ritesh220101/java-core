package com.aurionpro.model;

public class Circle {
	private final double radius;
	private final ColorType color;
	private final BorderType border;

	public Circle(double radius, ColorType color, BorderType border) {
		this.radius = radius;
		this.color = color;
		this.border = border;
	}

	public Circle(double radius, ColorType color) {
		this(radius, color, BorderType.DASHED);
	}

	public Circle(double radius) {
		this(radius, ColorType.RED, BorderType.DOTTED);
	}

	public Circle() {
		this(1, ColorType.BLUE, BorderType.SOLID);
	}

	public double getRadius() {
		return radius;
	}

	public ColorType getColor() {
		return color;
	}

	public BorderType getBorder() {
		return border;
	}

	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", border=" + border + "]";
	}

}
