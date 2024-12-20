package arrays;

import java.util.Scanner;

public class Matrix2X2 {

	public static void main(String[] args) {
//		int[][]arr= {{1,2},{3,4}};
//		System.out.println("length of the array is:"+arr.length);
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		//taken from user inputs
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the a size of array:");
		int a=obj.nextInt();
		System.out.println("enter the b size of array:");
		int b=obj.nextInt();
		int [][]array=new int [a][b];
		System.out.println("the length of array is:"+array.length);
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++){
				array[i][j] = obj.nextInt();
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++){
				System.out.print(array[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
