package javaMathameticalNumbers;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in); // Create a Scanner object
	        System.out.print("Enter a number to check if it is a palindrome: ");
	        int n = scanner.nextInt(); // Take input from the user
	        
	        int r, sum = 0, temp;    
	        temp = n;    
	        while (n > 0) {    
	            r = n % 10;  // Getting remainder  
	            sum = (sum * 10) + r;    
	            n = n / 10;    
	        }    
	        if (temp == sum) {    
	            System.out.println(temp + " is a palindrome number.");    
	        } else {    
	            System.out.println(temp + " is not a palindrome.");    
	        }    
	        scanner.close();

	}

}
