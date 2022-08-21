package com.aurionpro.test;

import java.util.*;

import com.aurionpro.model.Pig;

public class PigTest {

	public static void main(String[] args) {
		Pig pdg = new Pig();
		System.out.println("TURN " + pdg.getTurn());
		while (pdg.getTotalSum() + pdg.getTurnSum()< 20) {
			startGame(pdg);
		}
		System.out.println("You've completed the game in "+pdg.getTurn()+" turns");
		pdg.updateTotalSum();
		printGameDetails(pdg);
	}

	private static void startGame(Pig pdg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Roll or hold? (r/h): ");
		char c = sc.next().charAt(0);
		if (c == 'r') {
			rollPig(pdg);
		}
		if (c == 'h') {
			holdPig(pdg);
		}

	}

	private static void rollPig(Pig pdg) {
		int die = pdg.getDie();
		System.out.println("Die :" + die);
		if (die == 1) {
			pdg.updateTurnSumToZero();
			pdg.updateTurn();
			System.out.println("Your Turn Ends!!");
			System.out.println("TURN "+pdg.getTurn());
		}
		else {
			pdg.updateTurnSum(die);
		}
	}

	private static void holdPig(Pig pdg) {
		pdg.updateTotalSum();
		pdg.updateTurn();
		printGameDetails(pdg);
		pdg.updateTurnSumToZero();
		System.out.println("TURN " + (pdg.getTurn()));
	}

	private static void printGameDetails(Pig pdg) {
		System.out.println("Turn Sum :" + pdg.getTurnSum());
		System.out.println("Total Sum :" + pdg.getTotalSum());
		System.out.println("-----------------------------");
	}

}