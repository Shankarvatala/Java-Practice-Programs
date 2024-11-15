package contorlStatement;

import java.util.Scanner;

public class Odd_Or_Eeven_number {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in );
		System.out.println("enter the number ");
		int number=obj.nextInt();
		if(number%2==0) {
			System.out.println(number+":Even number");
		}
		else {
			System.out.println(number+":Odd number");
		}

	}

}
