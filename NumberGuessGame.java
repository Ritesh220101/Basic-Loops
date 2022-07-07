package com.aurionpro.test;

import java.util.*;

public class NumberGuessGame {
	public static int upper = 101;
	public static int lower = 1;
	public static int numberOfAttempts = 6;
	public static int turn = 1;

	public static void main(String[] args) {
		toStartOrExit();
	}

	private static void toStartOrExit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 to start the game and 0 to exit: ");
		int start = sc.nextInt();
		if (start == 1)
			startNumberGuessingGame();

		if (start == 0)
			System.out.println("Exited from the number guessing game");

		if (start != 1 && start != 0) {
			System.out.println("Invalid input enter either 1 or 0");
			toStartOrExit();
		}
	}

	private static void startNumberGuessingGame() {
		int number = getRandomNumber();
		while (turn <= numberOfAttempts) {
			boolean guess = startGuessing(number);
			checkGuess(guess);
		}
		if (turn == 7) {
			System.out.println("Oops you could'nt guess the number correctly your attempts have been over!!!");
			turn = 1;
			toStartOrExit();
		}

	}

	private static void checkGuess(boolean guess) {
		if (guess) {
			System.out.println("You've guessed it right in " + turn + " attempts");
			System.out.println("-----------------------------------------");
			turn = 1;
			toStartOrExit();
		}
	}

	private static boolean startGuessing(int number) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Attempt: " + turn);
		System.out.print("Enter the number: ");
		int userNumber = sc.nextInt();
		if (userNumber == number) {
			return true;
		} else if (userNumber > number) {
			System.out.println("Sorry, number is too high");
			System.out.println("-----------------------------------------");
		} else if (userNumber < number) {
			System.out.println("Sorry, number is too low");
			System.out.println("-----------------------------------------");
		}
		turn += 1;
		return false;

	}

	public static int getRandomNumber() {
		int randomNumber = (int) (Math.random() * (upper - lower)) + lower;
		return randomNumber;
	}

}
