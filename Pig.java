package com.aurionpro.test;

import java.util.*;

public class PigDiceMultiplayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the player1 name: ");
		String player1 = sc.next();
		System.out.print("Enter the player2 name: ");
		String player2 = sc.next();
		int target = 20;
		int upper = 6;
		int lower = 1;
		int player1TotalSum = 0;
		int player1TurnSum = 0;
		int player2TurnSum = 0;
		int player2TotalSum = 0;
		int turn1 = 1;
		int turn2 = 1;
		int die1 = 0;
		int die2 = 0;
		char c1 = 'a';
		char c2 = 'a';
		while (player1TotalSum < target && player2TotalSum < target) {
			while (die1 != 1 || c1 != 'h' || player1TotalSum < target) {
				System.out.println("TURN of " + player1 + " " + turn1);
				System.out.print("Roll or hold? (r/h): ");
				c1 = sc.next().charAt(0);
				if (c1 == 'r') {
					die1 = (int) (Math.random() * (upper - lower)) + lower;
					System.out.println("Die : " + die1);
					player1TurnSum += die1;
					if (die1 == 1) {
						player1TurnSum = 0;
						System.out.println("Turn Score of " + turn2 + " is: " + player2TurnSum);
						System.out.println("Total Sum: " + player1TotalSum);
						System.out.println("No Score, Turn Over");
						System.out.println();
						turn1 += 1;
						break;
					}
				}
				if (c1 == 'h') {
					player1TotalSum += player1TurnSum;
					System.out.println("Turn Score of " + turn1 + " is: " + player1TurnSum);
					System.out.println("Total Sum: " + player1TotalSum);
					player1TurnSum = 0;
					turn1 += 1;
					break;
				}
			}
			while ((die2 != 1 || c2 != 'h' || player2TotalSum < target) && player1TotalSum<target) {
				System.out.println("TURN of " + player2 + " " + turn2);
				System.out.print("Roll or hold? (r/h): ");
				c2 = sc.next().charAt(0);
				if (c2 == 'r') {
					die2 = (int) (Math.random() * (upper - lower)) + lower;
					System.out.println("Die : " + die2);
					player2TurnSum += die2;
					if (die2 == 1) {
						player2TurnSum = 0;
						System.out.println("Turn Score of " + turn2 + " is: " + player2TurnSum);
						System.out.println("Total Sum: " + player2TotalSum);
						System.out.println("No Score, Turn Over");
						System.out.println();
						turn2 += 1;
						break;
					}
				}
				if (c2 == 'h') {
					player2TotalSum += player2TurnSum;
					System.out.println("Turn Score of " + turn2 + " is: " + player2TurnSum);
					System.out.println("Total Sum: " + player2TotalSum);
					player2TurnSum = 0;
					turn2 += 1;
					break;
				}
			}
		}
		if (player1TotalSum >= target && player2TotalSum < target)
			System.out.println("Player " + player1 + " finished in " + (turn1 - 1) + " and wins!!");
		else
			System.out.println("Player " + player2 + " finished in " + (turn2 - 1) + " and wins!!");

	}

}
