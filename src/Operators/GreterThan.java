package Operators;

import java.util.Scanner;

public class GreterThan {
	
	public static void main(String[] args) {
		
			
	//grater tha (>)
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the all team");
		System.out.println("team 1 players is:");
		int team1 = obj.nextInt();
		System.out.println("team 2 players is:");
		int team2 = obj.nextInt();
		System.out.println("team 3 players is:");
		int team3 = obj.nextInt();
		System.out.println("team 4 players is:");
		int team4 = obj.nextInt();
		System.out.println("team 5 players is:");
		int team5 = obj.nextInt();
		System.out.println(team1 >= team2);
		System.out.println(team2 >= team3);
		System.out.println(team3 >= team4);
		System.out.println(team4 >= team5);
	
	

	}

}
