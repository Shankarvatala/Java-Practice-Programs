package practise_programs;

import java.util.Scanner;

public class AverageOfthreenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		float average;
		System.out.println("Enter the value of a:");
		a = sc.nextInt();
		System.out.println("Enter the value of b:");
		b = sc.nextInt();
		System.out.println("Enter the value of c:");
		c = sc.nextInt();
		average = (a+b+c)/3;
		System.out.println("The average of 3 numbers is:"+ average);

	}

}
