package com.aurionpro.test;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean prime = true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				prime = false;
				break;
			}
		}
		if(prime==true)
			System.out.println(number+" is prime");
		else System.out.println(number+" is not prime");
	}

}
