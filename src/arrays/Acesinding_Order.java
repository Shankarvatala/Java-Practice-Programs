package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Acesinding_Order {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the size:");
		int a=obj.nextInt();
		int[]arr=new int[a];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=obj.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);//  are using SORTING methods
		
		System.out.println("after sorting the array:");
		for(int res:arr) {
			System.out.println(res);
		}
			

	}

}
