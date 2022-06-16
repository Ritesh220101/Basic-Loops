import java.util.*;
class BookCricket{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Player 1 Name: ");
		String playerName1 = sc.next();
		System.out.print("Enter Player 2 Name: ");
		String playerName2 = sc.next();
		
		System.out.println("Player: "+playerName1);
		System.out.println("Open the book");
		int pageNumber1 = sc.nextInt();
		int score1 = pageNumber1%7;
		
		while(pageNumber1%7!=0){
			System.out.println("Open the book");
			pageNumber1 = sc.nextInt();
			score1 += pageNumber1%7;
		}
		
		System.out.println(playerName1+" score is: "+score1);
		
		System.out.println("Player: "+playerName2);
		System.out.println("Open the book");
		int pageNumber2 = sc.nextInt();
		int score2 = pageNumber2%7;
		
		while(score2<score1 && pageNumber2%7!=0){
			System.out.println("Open the book");
			pageNumber2 = sc.nextInt();
			score2 += pageNumber2%7;
 		}
		System.out.println(playerName2+" score is: "+score2);
		
		if(score1>score2)
			System.out.println(playerName1+" wins");
		else if(score1==score2)
			System.out.println("Draw"); 
		else System.out.println(playerName2+" wins");
	}

}
