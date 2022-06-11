package com.aurionpro.test;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1)
			System.out.print(0);
		else if(n==2)
			System.out.print(0+" "+1);
		else{
			int number1 = 0;
			int number2 = 1;
			System.out.print(0+" "+1);
			int number3 = 0;
			for(int i=2;i<n;i++) {
				number3 = number1 + number2;
				System.out.print(" "+number3);
				number1 =  number2;
				number2 = number3;
			}
		}
	
	}

}
