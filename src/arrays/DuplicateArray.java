package arrays;

import java.util.Scanner;

public class DuplicateArray {//duplicate element

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the length");
		int a=obj.nextInt();
		System.out.println("please enter elements");
		int[]arr=new int [a];
		for(int i=0;i<a;i++) {
			arr[i]=obj.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicste Element:"+arr[i]);
					break;
				}
			}
		}
	}

}
