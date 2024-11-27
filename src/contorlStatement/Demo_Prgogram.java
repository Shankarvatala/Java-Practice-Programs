package contorlStatement;

import java.util.Scanner;

public class Demo_Prgogram {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("who WIN in the first test Match ");
		System.out.println("total   score of india ");
		int india=obj.nextInt();
		System.out.println("total score of australia ");
		int australia=obj.nextInt();
		if(india>australia && australia<india) {
			System.out.println("india won the match");
		}
		else {
			if(india<australia && australia>india ) {

				System.out.println("austalia won the match");
			}
			else{
				System.out.println("score are equal then  match are tie");
			}


		}
	}
}
