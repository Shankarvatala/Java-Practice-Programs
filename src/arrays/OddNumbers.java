package arrays;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter size of array");
		int length=obj.nextInt();
		int[]array=new int[length];
		System.out.println("length of array is:"+array.length);
		int sum=0;
		for(int i=0;i<length;i++) {
		System.out.print("enter the numbers:");
			array[i]=obj.nextInt();
		}
		for (int i=0;i<length;i++) {
			if(array[i]%2!=0) {  // print the odd numbers 
				//sum+=array[i];
			System.out.println(array[i]);
			sum+=array[i];
		}
			System.out.println("the total  odd numbers are some of:"+sum);
		}
	}

}
