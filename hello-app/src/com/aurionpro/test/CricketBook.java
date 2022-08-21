package com.aurionpro.test;

import java.util.*;

public class CricketBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 to start the game and 0 to exit: ");
		int start = sc.nextInt();
		if (start == 1) {
			System.out.print("Enter player1 name: ");
			String player1 = sc.next();
			System.out.print("Enter player2 name: ");
			String player2 = sc.next();
			int turns1 = 12;
			int turns2 = 12;
			int score1 = 0;
//			int point1 = 0;
			int score2 = 0;
//			int point2 = 0;
			int count1 = 0;
			int count2 = 0;
			while (turns1 != 0) {
				score1 += book1(player1);
				turns1 -= 1;
				count1+=1;
			}
			System.out.println("Number of turns taken by " + player1 + " is " + count1);
			System.out.println(player2 + " needs " + (score1 + 1) + " runs to win");
			while (turns2 != 0 && score2 <= score1) {
				score2 = book2(player2, score1, score2);
				turns2 -= 1;
			}

			if (score1 > score2 || (score1 == score2 && count1 < count2))
				System.out.println(player1 + " wins");
			else if (score1 == score2 && count1 == count2) {
				System.out.println("Draw");
			} else
				System.out.println(player2 + " wins");
		} else {
			System.out.print("Exited");
		}
	}

	public static int book1(String player1) {
		int point1 = 0;
		int score1 = 0;
		int turns1 = 12;
		int upper = 300;
		int lower = 1;
		int count1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Player1: " + player1);
		System.out.print("Enter 1 to open book: ");
		int num1 = sc.nextInt();
		if (num1 == 1) {
			point1 = pointCricket1(player1, point1, score1, turns1, count1, upper, lower);
			score1 += point1;
			if(point1==0)
				
		}
		return score1;
	}

	public static int book2(String player2, int score1, int score2) {
		int point2 = 0;
		int turns2 = 12;
		int upper = 300;
		int lower = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Player2: " + player2);
		System.out.print("Enter 1 to open the book: ");
		int num2 = sc.nextInt();
		if (num2 == 1) {
			point2 = pointCricket2(point2, score2, score1, upper, lower, turns2);
			score2 += point2;
			if(point2==0)
				
		}
		return score2;
	}

	public static int pointCricket1(String player1,int point1, int score1, int turns1, int count1, int upper,
			int lower) {
		
		int pageNumber1 = (int) (Math.random() * (upper - lower)) + lower;
		if (pageNumber1 % 7 != 0) {
			point1 = pageNumber1 % 7;
			score1 += point1;
			turns1 -= 1;
			count1 += 1;
			System.out.println("Pagenumber: " + pageNumber1 + "\t Point:" + point1 + "\t Score:" + score1);

		}
		if (pageNumber1 % 7 == 0) {
			point1 = pageNumber1 % 7;
			turns1 -= 1;
			count1 += 1;
			System.out.println("Pagenumber: " + pageNumber1 + "\t Point:" + point1 + "\t Score:" + score1);
			System.out.println("Score is: " + score1);
			
		}
		return point1;
	}

	public static int pointCricket2(int point2, int score2, int score1, int upper, int lower, int turns2) {
		int pageNumber2 = (int) (Math.random() * (upper - lower)) + lower;
		if (score2 <= score1 && pageNumber2 % 7 != 0) {
			point2 = pageNumber2 % 7;
			score2 += point2;
			turns2 -= 1;
			System.out.println("Pagenumber: " + pageNumber2 + "\t Point:" + point2 + "\t Score:" + score2);
		}
		if (pageNumber2 % 7 == 0) {
			point2 = pageNumber2 % 7;
			System.out.println("Pagenumber: " + pageNumber2 + "\t Point:" + point2 + "\t Score:" + score2);
			turns2 -= 1;
		}
		return point2;
	}

}
