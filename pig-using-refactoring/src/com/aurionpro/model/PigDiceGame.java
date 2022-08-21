package com.aurionpro.model;
import java.util.Random;
public class PigDiceGame {
	private int totalGameScore;
	private int turnScore;
	private int turn;
	private static final int LEAST_NUM=1;
	private static final int MAX_NUM=7;
	
	public int getTotalScore() {
		return totalGameScore;
	}
	
	public int getTurnScore() {
		return turnScore;
	}


	public int getTurn() {
		return turn;
	}

	public int play() {
		int diceNumber=getrollDiceNumber();
		updateTurnScore(diceNumber);
		return diceNumber;
		
	}

	private void updateTurnScore(int diceNumber) {
		if(diceNumber==1) {
			this.turnScore=0;
		}
		else
		{
			this.turnScore+=diceNumber;
		}
	}

	private int getrollDiceNumber() {
		Random rand = new Random();
		return rand.nextInt(MAX_NUM-LEAST_NUM)+LEAST_NUM;
	}

	public void incrementTurn() {
		turn++;
	}

	public void updateTurnScoreToZero() {
		turnScore=0;
		
	}

	public void updateTotalScore() {
		totalGameScore+=turnScore;
	}
}
