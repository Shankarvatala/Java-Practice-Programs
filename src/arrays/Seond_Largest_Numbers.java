package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Seond_Largest_Numbers {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=obj.nextInt();
		
		if (size<2){
			System.out.println("arrays must have two elements");
			return;
		}
		int[]arr=new int[size];
		System.out.println("enter of the arrays:");
		for(int i=0;i<size;i++) {
			arr[i]=obj.nextInt();
		}
		Arrays.sort(arr);
		
		int largest=arr[size-1];
		int secondLargest=Integer.MIN_VALUE;
		
		for(int i=size-2;i>=0;i--) {
			if(arr[i]<largest) {
				secondLargest=arr[i];
				break;
			}
		}
		if(secondLargest==Integer.MIN_VALUE) {
			System.out.println("there is no second largest numbers");
		}
		else {
			System.out.println("the second largest numbers is:"+secondLargest);
			
		}
	}

}
