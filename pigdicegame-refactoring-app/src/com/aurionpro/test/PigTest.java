package com.aurionpro.test;

import java.util.*;

import com.aurionpro.model.Pig;

public class PigTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pig pdg = new Pig();
		while (pdg.getTotalSum() + pdg.getTurnSum() < 20) {
			startPig(pdg);
		}
		System.out.println("You've completed in " + (pdg.getTurn()) + " turns");
		pdg.setTotalSum(pdg.getTotalSum()+pdg.getTurnSum());
		pdg.printDetails();
	}

	private static void startPig(Pig pdg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("TURN " + pdg.getTurn());
		System.out.print("Roll or hold? (r/h): ");
		char c = sc.next().charAt(0);
		if (c == 'r') {
			pdg.roll();
		}
		if (c == 'h') {
			pdg.hold();
		}

	}

	

	

	

	
}
