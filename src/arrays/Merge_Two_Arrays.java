package arrays;

import java.util.Scanner;

public class Merge_Two_Arrays {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int[] arr= {10,20,30};
		int[]arr1= {40,50,60};
		
		int a=arr.length;
		int b=arr.length;
		 
		int c=a+b;
		int[]d=new int[c];
		
		for(int i=0;i<arr.length;i++) {
		d[i]=arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			d[a+i]=arr1[i];
		}
		System.out.println("merge array");
		for (int i=0;i<c;i++) {
			System.out.print(d[i]+" ");
		}
		
	
		
	}

}
