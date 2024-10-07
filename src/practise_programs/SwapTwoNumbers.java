package practise_programs;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("enter first number");
		int firstNumber = obj.nextInt();
		System.out.println("enter seond number");
		int secondNumber = obj.nextInt();
		// System.out.println("enter the third number");
		int thirdNumber;
		thirdNumber = firstNumber;
		firstNumber = secondNumber;
		secondNumber = thirdNumber;
		System.out.println("SWAP THE NUMBERS ARE::");
		System.out.println(" enter firstNumber ::" + firstNumber);
		System.out.println(" enter secondNumber::" + secondNumber);

	}

}

  