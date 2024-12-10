package contorlStatement;

import java.util.Scanner;

public class IndiCricketTeam {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("  india team T20 squd");
		System.out.println("enter the players details");
		int numOfPlayers=obj.nextInt();
		for(int i=1;i<numOfPlayers;i++) {
		System.out.println("enter the player name");
		String name=obj.next();
		System.out.println("enter the player age ");
		short age=obj.nextShort();
		System.out.println("enter best score of t20 format");
		short BestScore=obj.nextShort();
		System.out.println("enter the player avg");
		double avg=obj.nextDouble();
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("best score:"+BestScore);
		System.out.println("avg:"+avg);
		}
	}

}
