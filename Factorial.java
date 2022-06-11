package com.aurionpro.test;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int fact = 1;
		for(int i=number;i>0;i--) {
			fact*=i;
		}
		System.out.println(fact);
	}

}
