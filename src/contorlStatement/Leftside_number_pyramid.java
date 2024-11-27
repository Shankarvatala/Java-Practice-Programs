package contorlStatement;

public class Leftside_number_pyramid {

	public static void main(String[] args) 
	{
		        int rows = 4; // Number of rows in the pattern
		        int num = 1;  // Starting number
		        
		        for (int i = 1; i <= rows; i++) {
		            // Print leading spaces
		            for (int space = 1; space <= rows - i; space++) {
		                System.out.print("  "); // Two spaces for alignment
		            }
		            
		            // Calculate starting number for the row
		            int start = num + i - 1;
		            
		            // Print numbers in reverse for the row
		            for (int j = 0; j < i; j++) {
		                System.out.print(start-- + " ");
		            }
		            
		            // Update the next starting number
		            num += i;
		            
		            // Move to the next line
		            System.out.println();
		        }

	}

}
