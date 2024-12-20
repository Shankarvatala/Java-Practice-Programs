package arrays;

import java.util.Scanner;

public class EvenNumbersTheMatrix {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter rows");
		int a = obj.nextInt();
		System.out.println("enter colums");
		int b = obj.nextInt();
		int[][] arr = new int[a][b];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int num = obj.nextInt(); // the LOGIC OF PRINT THE EVEN NUMBERS ON MATRIX 
				if (num % 2 != 0) {
					arr[i][j] = num;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
