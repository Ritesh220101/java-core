package com.aurionpro.model;

public class Pig {
	private int totalSum;
	private int turnSum;
	private int turn=1;
	final private int lower = 1;
	final private int upper = 6;

	public int getTotalSum() {
		return totalSum;
	}

	public int getTurnSum() {
		return turnSum;
	}

	public int getTurn() {
		return turn;
	}

	public void updateTurn() {
		turn+=1;
	}
	
	public void updateTurnSum(int die) {
		if(die==1)
			this.turnSum = 0;
		this.turnSum+=die;
	}
	
	public void updateTotalSum() {
		totalSum+=turnSum;
	}
	
	public void updateTurnSumToZero() {
		turnSum = 0;
	}
	public int getDie() {
		int die = (int) (Math.random() * (upper - lower)) + lower;
		return die;
	}
	
}
