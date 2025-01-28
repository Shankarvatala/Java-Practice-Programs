package arrays;

import java.util.Scanner;

public class Triplet_Program {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number of elements in the array:");
		int n=obj.nextInt();
		int[]arr=new int [n];
		
		System.out.println("enter the elements of the array:");
		for(int i=0;i<n;i++) {
			arr[i]=obj.nextInt();
		}
		int count=0;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]==arr[k]) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
