package Operators;

import java.util.Scanner;

public class Large_3Numbers {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("puri age is :");
		int person1 = obj.nextInt();
		System.out.println("shankar age is : ");
		int person2 = obj.nextInt();
		System.out.println("sai age is :");
		int person3 = obj.nextInt();
		int result=(person1>person2)?(person1>person3 ? person1:person3):(person2>person3 ? person2:person3);
     System.out.println(result);
	}

}
