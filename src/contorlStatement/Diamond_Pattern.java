package contorlStatement;

import java.util.Scanner;

public class Diamond_Pattern {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of rows for the diamond (half part): ");
	        int rows = scanner.nextInt();
	        
	        // Upper part of the diamond
	        for (int i = 1; i <= rows; i++) {
	            // Print spaces
	            for (int j = i; j < rows; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	        // Lower part of the diamond
	        for (int i = rows - 1; i >= 1; i--) {
	            // Print spaces
	            for (int j = rows; j > i; j--) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	        scanner.close();
	    }
	}

	


