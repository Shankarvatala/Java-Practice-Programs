package Operators;

import java.util.Scanner;

public class Rnage_Demo_Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LONG RANGE");
		System.out.println(Long.MIN_VALUE + " to " + Long.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + "  TO	" + Integer.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + " to " + Double.MAX_VALUE);
		System.out.println(Float.MIN_VALUE + " to " + Float.MAX_VALUE);
		
		
		
		
		
		// number convert to binary numbers
		int n = 20;
		while (n >= 1) {
			System.out.print(n % 2);
			n = n / 2;
		}

	}

}
