package javaMathameticalNumbers;

import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Create a Scanner object
		System.out.print("Enter a number to check if it is prime: ");
		int n = scanner.nextInt(); // Take input from the user

		int  num = 0, temp = 0;      
		num = n / 2;      
		if (n == 0 || n == 1) {  
			System.out.println(n + " is not a prime number");      
		} else {  
			for (int i = 2; i <= num; i++) {      
				if (n % i == 0) {      
					System.out.println(n + " is not a prime number");      
					temp = 1;      
					break;      
				}      
			}      
			if (temp == 0) { 
				System.out.println(n + " is a prime number"); 
			}  
		}  
		scanner.close();
	}
}