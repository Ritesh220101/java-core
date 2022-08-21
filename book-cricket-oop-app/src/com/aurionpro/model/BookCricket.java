package com.aurionpro.model;

import java.util.*;

public class BookCricket {

	public void playgame(Player p1, Player p2) {
		Scanner sc = new Scanner(System.in);
		int pageNumber1 = -1;
		int pageNumber2 = -1;
		int point;
		int score1 = 0;
		int score2 = 0;
		int count1 = 0;
		int count2 = 0;
		System.out.println("Enter the player1 name: ");
		p1.setName(sc.next());
		System.out.println("Enter the player2 name: ");
		p2.setName(sc.next());
		while (pageNumber1 % 7 != 0) {
			System.out.println("Player: " + p1.getName());
			System.out.print("Enter 1 to open book:");
			int n1 = sc.nextInt();
			if (n1 == 1) {
				pageNumber1 = getrandomPageNumber(1, 300);
				point = pageNumber1 % 7;
				score1 += point;
				count1 += 1;
				printPointScoreRounds(pageNumber1, point, score1, count1);
				setScoreRounds(p1, score1, count1);
			}
		}
			System.out.println("Player " + p1.getName() + " scored " + p1.getScore() + " in " + p1.getRounds() + " rounds");
			int target = p1.getScore() + 1;
			System.out.println("Target for " + p2.getName() + " is " + target);
			
			while (pageNumber2 % 7 != 0 && p2.getScore() <= p1.getScore()) {
				System.out.println("Player: " + p2.getName());
				System.out.print("Enter 1 to open book:");
				int n2 = sc.nextInt();
				if (n2 == 1) {
					pageNumber2 = getrandomPageNumber(1, 300);
					point = pageNumber2 % 7;
					score2 += point;
					count2 += 1;
					printPointScoreRounds(pageNumber2, point, score2, count2);
					setScoreRounds(p2, score2, count2);
				}

			}
			checkWhoWins(p1,p2);
			
		}
		



	public static int getrandomPageNumber(int lower, int upper) {
		int pageNumber = (int) (Math.random() * (upper - lower)) + lower;
		return pageNumber;
	}

	public static void printPointScoreRounds(int pageNumber, int point, int score, int count) {
		System.out
				.println("Page Number :" + pageNumber + " Point :" + point + " Score :" + score + " Rounds: " + count);
	}

	public static void setScoreRounds(Player p, int score, int count) {
		p.setScore(score);
		p.setRounds(count);
	}
	public static void checkWhoWins(Player p1,Player p2) {
		if (p1.getScore() > p2.getScore() || (p1.getScore() == p2.getScore() && p1.getRounds() < p2.getRounds())) {
			System.out.println("\nPlayer " + p1.getName() + " wins");
		} else if (p1.getScore() == p2.getScore() && p1.getRounds() == p2.getRounds())
			System.out.println("Tie");
		else
			System.out.println("\nPlayer " + p2.getName() + " wins");
		
	}

}
