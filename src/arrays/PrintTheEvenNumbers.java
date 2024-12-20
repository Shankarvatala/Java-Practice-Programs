package arrays;

import java.util.Scanner;

public class PrintTheEvenNumbers {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("enter the how many arrays is stored in lengths of the arrays:");
		int length = obj.nextInt();
		int[] eveNumbers = new int[length];// {ARRAY OBJECT CREATING}
		System.out.println("length of array:" + eveNumbers.length);
		for (int i = 0; i < length; i++) {
			System.out.print("enter the number:");
			eveNumbers[i] = obj.nextInt();
		}

		for (int i = 0; i < length; i++) {
			if (eveNumbers[i] % 2 == 0) {
				System.out.println(eveNumbers[i]);
			}
		}

	}

}
