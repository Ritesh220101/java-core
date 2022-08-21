package com.aurionpro.test;

import com.aurionpro.model.PigDiceGame;
import java.util.*;
public class PigDiceTest {
	public static void main(String[] args) {
//		System.out.println("Developed by Aju Palleri @ Swabhav Techlabs\n");
		PigDiceGame pg = new PigDiceGame();
		System.out.println(
				"* See how many turns it takes you to get to 20.\r\n" + "* Turn ends when you hold or roll a 1.\r\n"
						+ "* If you roll a 1, you lose all points for the turn.\r\n"
						+ "* If you hold, you save all points for the turn.");

		System.out.println("TURN " + (pg.getTurn() + 1));

		while ((pg.getTotalScore() + pg.getTurnScore()) < 20) {
			startTurn(pg);
		}
		pg.updateTotalScore();
		System.out.println("You Won!!!");
		pg.incrementTurn();
		printScoreDetails(pg);
	}

	private static void startTurn(PigDiceGame pg) {
		Scanner sc = new Scanner(System.in);
		String choice;
		System.out.print("Roll or hold? (r/h):");
		choice = sc.nextLine();
		if (choice.equalsIgnoreCase("h")) {
			hold(pg);
			return;
		}
		if (choice.equalsIgnoreCase("r")) {
			 roll(pg);
		}
	}

	private static void reset(PigDiceGame pg) {
		System.out.println("Your Turn Ends!!");
		pg.incrementTurn();
		printScoreDetails(pg);
		System.out.println("TURN " + (pg.getTurn() + 1));
	}

	private static int roll(PigDiceGame pg) {
		int diceNumber;
		diceNumber = pg.play();
		System.out.println(diceNumber);
		if (diceNumber == 1) {
			reset(pg);
		}
		return diceNumber;
	}

	private static void hold(PigDiceGame pg) {
		pg.updateTotalScore();
		pg.incrementTurn();
		printScoreDetails(pg);
		pg.updateTurnScoreToZero();
		System.out.println("TURN " + (pg.getTurn() + 1));
	}

	private static void printScoreDetails(PigDiceGame pg) {
		System.out.println("Turn Score : " + pg.getTurnScore());
		System.out.println("Total Score : " + pg.getTotalScore());
		System.out.println("Total Turns : " + pg.getTurn());
		System.out.println("-----------------------------\n");
	}
}
