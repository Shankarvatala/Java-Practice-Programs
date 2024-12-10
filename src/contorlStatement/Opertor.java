package contorlStatement;

import java.util.Scanner;

public class Opertor {

	public static void main(String[] args) {
		int sum;
		Scanner obj=new Scanner(System.in);
		System.out.println("select the one operator + - * / %");
		String name=obj.nextLine();
		System.out.println("a value ");
		int a=obj.nextInt();
		System.out.println("b value");
		int b=obj.nextInt();
		switch(name) {
		case "+":
			 sum=a+b;
			System.out.println(sum);
			break;
		case "-":
			sum=a-b;
			System.out.println(sum);
			break;
		case "*":
			sum=a*b;
			System.out.println(sum);
			break;
		case "/":
			sum=a/b;
			System.out.println(sum);
			break;
		case "%":
			sum=a%b;
			System.out.println(sum);
			break;
		}
	}

}
