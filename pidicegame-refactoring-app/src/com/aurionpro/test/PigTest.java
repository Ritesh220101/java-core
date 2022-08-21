package com.aurionpro.test;
import java.util.*;

import com.aurionpro.model.Pig;
public class PigTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pig pdg = new Pig();
		while(pdg.getTotalSum()<20) {
			startPig(pdg);
		}
		System.out.println("You've completed in "+(pdg.getTurn()-1)+ " turns");
	}
	
	private static void startPig(Pig pdg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("TURN "+pdg.getTurn());
		System.out.print("Roll or hold? (r/h): ");
		char c = sc.next().charAt(0);
		if(c=='r') {
			roll(pdg);
		}
		if(c=='h') {
			hold(pdg);
		}
		
	}

	private static void hold(Pig pdg) {
		pdg.setTotalSum(pdg.getTotalSum()+pdg.getTurnSum());
		System.out.println("Turn Sum: "+pdg.getTurnSum());
		System.out.println("Total Sum: "+pdg.getTotalSum());
		pdg.setTurnSum(0);
		pdg.setTurn(pdg.getTurn()+1);
		
	}

	private static void roll(Pig pdg) {
		int die = getDie();
		System.out.println("Die: "+die);
		if(die==1) {
			System.out.println("Turn Over!!!");
			pdg.setTurnSum(0);
			pdg.setTurn(pdg.getTurn()+1);
		}
		else {
			pdg.setTurnSum(pdg.getTurnSum()+die);
		}
	}

	public static int getDie() {
		int die = (int) (Math.random() * (6 - 1)) + 1;
		return die;
	}
}
