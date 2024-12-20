package arrays;

import java.util.Scanner;

public class SumOfArrays {

	public static void main(String[] args) {
	 Scanner obj=new Scanner(System.in);
	 System.out.println("enter the number");
	 int b=obj.nextInt();
	 int[] arr=new int [b];
	 System.out.println("length of array:"+arr.length);
	int sum=0;
	 for(int i=0;i<b;i++) {
		 arr[i]=obj.nextInt();
		 sum+=arr[i];
		 
	 }
	 
//	int sum = 0;
//	 for (int i=0;i<b;i++) {
//		// System.out.println(arr[i]);
//			
//		sum+=arr[i];
//			 
//		 
		 System.out.println("the total sum of :"+sum);
	 }

	}

//}
