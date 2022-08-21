package com.aurionpro.test;

import java.util.*;
import com.aurionpro.model.*;

public class RectangleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rectangles : ");
		int n = sc.nextInt();
		System.out.println();
		Rectangle rectangles[] = new Rectangle[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the height of object : ");
			int height = sc.nextInt();
			System.out.print("Enter the width of object : ");
			int width = sc.nextInt();
			System.out.print("Enter the color of object  : ");
			String str = sc.next();
			ColorType color;
			try {
				color = ColorType.valueOf(str.toUpperCase());
			}
			catch(IllegalArgumentException e) {
				color = ColorType.RED;
			}
			rectangles[i] = new Rectangle(height, width, color);
		}
		for (Rectangle r : rectangles) {
			System.out.println(r);
			System.out.println("Area is: "+r.calculateArea());
		}	
	}
}
