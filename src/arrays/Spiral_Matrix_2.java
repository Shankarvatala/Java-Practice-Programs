package arrays;
import java.util.Scanner;
public class Spiral_Matrix_2 {

	public static void main(String[] args) {
		        Scanner obj = new Scanner(System.in);

		        // Input matrix size
		        System.out.print("Enter the size of the matrix (n): ");
		        int n = obj.nextInt();

		        // Initialize the matrix
		        int[][] matrix = new int[n][n];

		        // Fill the matrix in spiral order
		        int value = 1; // Starting value
		        int top = 0, bottom = n - 1, left = 0, right = n - 1;

		        while (value <= n * n) {
		            // Fill top row
		        	
		            for (int i = left; i <= right; i++) {
		                matrix[top][i] = value++;
		            }
		            top++;

		            // Fill right column
		            for (int i = top; i <= bottom; i++) {
		                matrix[i][right] = value++;
		            }
		            right--;

		            // Fill bottom row
		            for (int i = right; i >= left; i--) {
		                matrix[bottom][i] = value++;
		            }
		            bottom--;

		            // Fill left column
		            for (int i = bottom; i >= top; i--) {
		                matrix[i][left] = value++;
		            }
		            left++;
		        }

		        // Print the matrix
		        System.out.println("Spiral Matrix:");
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < n; j++) {
		                System.out.printf("%4d", matrix[i][j]);
		            }
		            System.out.println();
		        }

		        
		      }
		}


	


