package strings;

import java.util.Scanner;

public class StringIsPalindrome {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a string name:");
		String name=obj.nextLine();
		String reversed = new StringBuilder(name).reverse().toString();

		if (name.equalsIgnoreCase(reversed)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}   

	}

}
    