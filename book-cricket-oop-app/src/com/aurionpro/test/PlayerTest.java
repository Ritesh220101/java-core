package com.aurionpro.test;

import java.util.*;

import com.aurionpro.model.*;

public class PlayerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 to start the game and 0 to exit : ");
		int start = sc.nextInt();
		if (start == 1) {
			BookCricket bc = new BookCricket();
			Player p1 = new Player();
			Player p2 = new Player();
			bc.playgame(p1, p2);
		} else if (start == 0) {
			System.out.println("You've exited");
		}
	}
}
