package contorlStatement;

import java.util.Scanner;

public class Convert_To_Binary_Type {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		int n=obj.nextInt();
		while(n>=1) {
		System.out.print(n%2);
		
        n=n/2;
	}
	}
}
