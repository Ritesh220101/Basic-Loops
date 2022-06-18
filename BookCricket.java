package com.aurionpro.test;
import java.util.*;
public class CricketBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Enter 1 to start the game and 0 to exit: ");
		int start = sc.nextInt();
		if(start==1) {
			System.out.print("Enter player1 name: ");
			String player1 = sc.next();
			System.out.print("Enter player2 name: ");
			String player2 = sc.next();
			int turns1 = 12;
			int turns2 = 12;
			int lower = 1;
			int upper = 300;
			int score1 = 0;
			int point1 = 0;
			int score2 = 0;
			int point2 = 0;
			int count1 = 0;
			int count2 = 0;
			while(turns1!=0) {
				System.out.println("Player1: "+player1);
				System.out.print("Enter 1 to open book: ");
				int num1 = sc.nextInt();
				if(num1==1) {
					int pageNumber1 = (int) (Math.random() * (upper - lower)) + lower;
					if(pageNumber1%7!=0) {
						point1 = pageNumber1%7;
						score1+=point1;
						turns1-=1;
						count1+=1;
						System.out.println("Pagenumber: "+pageNumber1+"\t Point:"+point1+"\t Score:"+score1);
					}
					if(pageNumber1%7==0){
						point1 = pageNumber1%7;
						turns1-=1;
						count1+=1;
						System.out.println("Pagenumber: "+pageNumber1+"\t Point:"+point1+"\t Score:"+score1);
						System.out.println("Score is: "+score1);
						System.out.println("Number of turns taken by "+player1+" is "+count1);
						break;
					}
						
				}
			}
			while(turns2!=0) {
				System.out.println("Player2: "+player2);
				System.out.print("Enter 1 to open the book: ");
				int num2 = sc.nextInt();
				if(num2==1) {
					int pageNumber2 = (int) (Math.random() * (upper - lower)) + lower;
					if(score2<=score1 && pageNumber2%7!=0) {
						point2 = pageNumber2%7;
						score2+=point2;
						turns2-=1;
						System.out.println("Pagenumber: "+pageNumber2+"\t Point:"+point2+"\t Score:"+score2);
					}
					else if(pageNumber2%7==0){
						point2 = pageNumber2%7;
						System.out.println("Pagenumber: "+pageNumber2+"\t Point:"+point2+"\t Score:"+score2);
						turns2-=1;
						break;
					}

				}
			}
			
			if(score1 > score2 || (score1 == score2 && count1 < count2))
				System.out.println(player1+" wins");
			else if(score1==score2 && count1==count2) {
				System.out.println("Draw");
			}
			else System.out.println(player2+" wins");
		}
		else {
			System.out.print("Exited");
		}
	}

}
