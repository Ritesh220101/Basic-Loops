package com.aurionpro.test;

import java.util.*;

public class Pig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalSum = 0;
		int lower = 1;
		int upper = 6;
		int turns = 1;
		int target = 20;
		int turnSum = 0;
		while (totalSum < target) {
			System.out.println("TURN " + turns);
			System.out.print("Roll or hold? (r/h): ");
			char c = sc.next().charAt(0);
			if (c == 'r') {
				int die = (int) (Math.random() * (upper - lower)) + lower;
				System.out.println("Die : " + die);
				turnSum += die;
				if (die == 1) {
					turnSum = 0;
					totalSum += turnSum;
					turns += 1;
					System.out.println("Total Sum: " + totalSum);
					System.out.println("Turn Over, No Score");
					System.out.println();
				}

			} else if (c == 'h') {
				totalSum += turnSum;
				System.out.println("Total sum is: " + totalSum);
				System.out.println();
				turnSum = 0;
				turns+=1;
			} else {
				System.out.println("Code Exited");
				break;
			}
		}
		if (totalSum >= target) {
			System.out.println("Total Sum is: " + totalSum);
			System.out.println("\nYou finished in " + (turns-1) + " turns!");
		}
	}
