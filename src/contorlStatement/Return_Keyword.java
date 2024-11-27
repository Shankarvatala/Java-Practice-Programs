package contorlStatement;

import java.util.Scanner;

public class Return_Keyword {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		System.out.println("enter the number");
		int a=b.nextInt();
		for(int i=10;i>=a;i--) {
			
			System.out.println(i);
		//return;
		}

	}

}
