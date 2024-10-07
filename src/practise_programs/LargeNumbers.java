package practise_programs;

import java.util.Scanner;

public class LargeNumbers {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int a = 888, b = 333, c = 999;
		int largest;
		System.out.println("ENTER THE LARGEST NUMBER");
		System.out.println("enter the A number");
		int num = obj.nextInt();
		System.out.println("enter the B number");
		int numb = obj.nextInt();
		System.out.println("enter the c number");
		int number = obj.nextInt();
		if (a >= b && a >= c) {
			largest = a;
		} else if (b >= a && b >= c) {
			largest = b;
		} else {
			largest = c;
		}
		System.out.println("enter the largest numbers");
		System.out.println(largest);
	}
}
		
		
	

	
