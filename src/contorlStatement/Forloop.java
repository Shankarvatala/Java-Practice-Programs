package contorlStatement;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		int n=obj.nextInt();
	       int num=10;
		for(int i=1;i<=num;i++) {
		System.out.println(i +"x"+ n +"="+(i*n));	
			
		}

	}

}
