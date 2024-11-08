package Operators;

import java.util.Scanner;

public class Assignment_Operator {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a value");
		int a = obj.nextInt();
		System.out.println("enter b value");
		int b = obj.nextInt();
		System.out.println("the sum of values");
		System.out.println(a = b);
		System.out.println(a += b);
		System.out.println(a -= b);
		System.out.println(a *= b);
		System.out.println(a /= b);
		System.out.println(a %= b);

	}

}
