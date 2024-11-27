package contorlStatement;

import java.util.Scanner;

public class A_To_Z_Letterr {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("print the letter A to Z");

		char i = 'a';

		// for(i='z';i>='a';i--) { // z to a reverase
		for (i = 'A'; i <= 'Z'; i++) { // a to z

			System.out.print(" "+i);

		}
		// System.out.println("itterating of the loop is:"+i);
	}
}
