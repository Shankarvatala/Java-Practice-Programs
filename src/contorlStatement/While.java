package contorlStatement;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enrer a number");
		int n=obj.nextInt();
		int i=1,num=10;
		while(i<=num) {
			
		System.out.println(i + "x"+ n +"=" + (i*n));
		i++;
		}
		//System.out.println(i+"x"+n+"="+(i*n));
	}

}
