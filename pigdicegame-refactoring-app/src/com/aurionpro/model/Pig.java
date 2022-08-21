package com.aurionpro.model;

public class Pig {
	private int turn = 1;
	private int turnSum;
	private int totalSum;
	private static int lower = 1;
	private static int upper = 7;
	public int getTurn() {
		return turn;
	}

	public int getTurnSum() {
		return turnSum;
	}

	public int getTotalSum() {
		return totalSum;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public void setTurnSum(int turnSum) {
		this.turnSum = turnSum;
	}

	public void setTotalSum(int totalSum) {
		this.totalSum = totalSum;
	}

	public static int getDie(int lower,int upper) {
		int die = (int) (Math.random() * (upper - lower)) + lower;
		return die;
	}

	public void roll() {
		int die = getDie(lower,upper);
		System.out.println("Die: " + die);
		if (die == 1) {
			System.out.println("Turn Over!!!");
			setTurnSum(0);
			printDetails();
			setTurn(getTurn() + 1);
		} else {
			setTurnSum(getTurnSum() + die);
		}
	}

	public void hold() {
		setTotalSum(getTotalSum() + getTurnSum());
		printDetails();
		setTurnSum(0);
		setTurn(getTurn() + 1);
	}

	public void printDetails() {
		System.out.println("Turn Sum: " + getTurnSum());
		System.out.println("Total Sum: " + getTotalSum());
		System.out.println("----------------------");

	}

}
