package contorlStatement;

import java.util.Scanner;

public class Break_Statement {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number ");
		int number=obj.nextInt();
		for (int i=1;i<=number;i++) {
			if(i==5) {
				//break;
			}
			System.out.println(i);
		}
		System.out.println(number);

	}

}
