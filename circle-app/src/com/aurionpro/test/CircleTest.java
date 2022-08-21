package com.aurionpro.test;

import com.aurionpro.model.BorderType;
import com.aurionpro.model.Circle;
import com.aurionpro.model.ColorType;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle1 = new Circle(10, ColorType.BLUE, BorderType.SOLID);
		System.out.println(circle1);
		System.out.println("Area is : " + circle1.calculateArea());

		Circle circle2 = new Circle(5, ColorType.GREEN);
		System.out.println(circle2);
		System.out.println("Area is : " + circle2.calculateArea());

		Circle circle3 = new Circle(3);
		System.out.println(circle3);
		System.out.println("Area is : " + circle3.calculateArea());

		System.out.println("--------------------------------------------------------------");

		Circle[] circles = { 
				new Circle(20, ColorType.BLUE, BorderType.SOLID),
				new Circle(30, ColorType.GREEN, BorderType.DOTTED), 
				new Circle(40, ColorType.RED, BorderType.DASHED),
				new Circle(50, ColorType.BLUE, BorderType.DOTTED),
				new Circle(60, ColorType.GREEN),
				new Circle()
				};

		for (Circle c : circles) {
			System.out.println(c);
			System.out.println("Area is: "+c.calculateArea());
			System.out.println();
		}
	}

}
