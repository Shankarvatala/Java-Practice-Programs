package contorlStatement;

import java.util.Scanner;

public class Positive_Or_Negitive_Numberr {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the nuber");
		int number = obj.nextInt();
		if (number > 0) {
			System.out.println("positive number");
		} else if (number < 0) {
			System.out.println("negitive number");
		} else {

			System.out.println("middle number of 0");
		}
	
	}

}
