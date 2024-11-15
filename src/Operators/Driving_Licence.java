package Operators;

import java.util.Scanner;

public class Driving_Licence {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the person age for check the driving licence");
		System.out.println("enter the person age");
		int person=obj.nextInt();
		String age=(person>=18)?("Eligible for driving licence is :"+person):("Not Eligiable for driving licence is :"+person);
		System.out.println(age);

	}

}
