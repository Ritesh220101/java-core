package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(100, 200);
		Rectangle r2 = new Rectangle(100, 200);
		System.out.println(r1.equals(r2));
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
	}

}
