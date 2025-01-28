package hackthon2;

import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the array1");
		int a=obj.nextInt();
		System.out.println("enter the array2");
		int b=obj.nextInt();
		int[]arr1=new int[a];
		int[]arr2=new int[b];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=obj.nextInt();
		}
	
		for(int j=0;j<arr2.length;j++) {
			arr2[j]=obj.nextInt();
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
	
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
				
			}
		
		
		}

	}

}
