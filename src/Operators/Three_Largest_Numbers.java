package Operators;

import java.util.Scanner;

public class Three_Largest_Numbers {

	public static void main(String[] args) {
		
			Scanner obj=new Scanner(System.in);
		System.out.println("enter a number");
		int a=obj.nextInt();
		System.out.println("enter b number");
		int b=obj.nextInt();
		System.out.println("enter c number");
		int c=obj.nextInt();
		if (a>b && a>b) {
			System.out.println("a is big:"+a);
			
		}
		else if(b>c && b>a) {
			System.out.println("b is big:"+b);
			
		}
		else {
			System.out.println("c is big :"+c);
		}
	//********************************************************************	
		
		//another way of program
		//int a=45,b=66,c=44;
		if(a>b) {
			if(a>c) {
				System.out.println("a is big"+a);
			}
		}
		else if(b>c) {
			System.out.println("b is big "+b);
		}
		else {
			System.out.println("c is big"+c);
		}
	}

}
