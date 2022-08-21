package com.aurionpro.test;

import java.util.*;

public class Tictactoe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a[][] = new String[3][3];
		boolean lastEnteredX = false;
		boolean lastEnteredO = true;
		boolean b[][] = new boolean[3][3];
		String mark;
		String mark1 = "X";
		String mark2 = "O";
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = Integer.toString(i) + Integer.toString(j);

			}
		}

		while (count != 9) {
			try {
				printTicTacToe(a);
				System.out.println("Enter your move: ");
				int row = sc.nextInt();
				int col = sc.nextInt();

				if (b[row][col] == true)
					System.out.println("That position is already filled please enter a different position");
				if (lastEnteredO == true && b[row][col] == false) {
					a[row][col] = mark1;
					b[row][col] = true;
					lastEnteredX = true;
					lastEnteredO = false;
					count += 1;
				}

				if (lastEnteredX == true && b[row][col] == false) {
					a[row][col] = mark2;
					b[row][col] = true;
					lastEnteredO = true;
					lastEnteredX = false;
					count += 1;
				}
				if ((a[0][0].equals(a[0][1]) && a[0][0].equals(a[0][2]))
						|| (a[1][0].equals(a[1][1]) && a[1][0].equals(a[1][2]))
						|| (a[2][0].equals(a[2][1]) && a[2][0].equals(a[2][2]))
						|| (a[0][0].equals(a[1][0]) && a[0][0].equals(a[2][0]))
						|| (a[0][1].equals(a[1][1]) && a[0][1].equals(a[2][1]))
						|| (a[0][2].equals(a[1][2]) && a[0][2].equals(a[2][2]))
						|| (a[0][0].equals(a[1][1]) && a[0][0].equals(a[2][2]))
						|| (a[0][2].equals(a[1][1]) && a[0][2].equals(a[2][0]))) {

					printTicTacToe(a);
					mark = a[row][col];
					System.out.println("Player " + mark + " wins!!!!!!");
					break;
				}

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out of bounds");
			}
		}

		if (count == 9) {
			printTicTacToe(a);
			System.out.println("Draw");
		}

	}

	private static void printTicTacToe(String[][] a) {
		System.out.println(a[0][0] + "|" + a[0][1] + "|" + a[0][2]);
		System.out.println("--------");
		System.out.println(a[1][0] + "|" + a[1][1] + "|" + a[1][2]);
		System.out.println("--------");
		System.out.println(a[2][0] + "|" + a[2][1] + "|" + a[2][2]);
	}

}
