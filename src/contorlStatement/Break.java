package contorlStatement;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		int number=obj.nextInt();
		
		for(int n=8;n<=7;n++) {
			if (n==7) {
				break;
			}
			
			System.out.println("Current value of i:"+n);
		}
		System.out.println("You entered :"+number );
		
		  
	}
	}


