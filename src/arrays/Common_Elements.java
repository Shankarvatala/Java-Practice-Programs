package arrays;

import java.util.Scanner;

public class Common_Elements {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	System.out.println("enter the array1 length");
	int a=obj.nextInt();
	System.out.println("enter the array2 length");
	int b=obj.nextInt();
	int result1=0;
	int result2=0;
	int[]array1=new int[a];
	int[]array2=new int[b];
	for(int i=0;i<array1.length;i++) {
		array1[i]=obj.nextInt();
	}
	for(int j=0;j<array2.length;j++) {
		array1[j]=obj.nextInt();
	}
	for(int i=0;i<array1.length;i++) {
	 result1=	array1[i];
	}
	for(int j=0;j<array1.length;j++) {
		 result2=array2[j];
	}
	if(result1==result2) {
		System.out.println(result1 );
		
	}
	}

}
