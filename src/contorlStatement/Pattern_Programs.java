package contorlStatement;

import java.util.Scanner;

public class Pattern_Programs {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		int num=obj.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=num;j>=1;j--) {   
				if(j==i) {
				System.out.print("* ");
			}
				else {
					System.out.print(j+" ");
				
				}
				
			
		}
			System.out.println();
		}
		

	}

}
