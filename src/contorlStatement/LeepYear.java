package contorlStatement;

import java.util.Scanner;

public class LeepYear {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the year");
		int year=obj.nextInt();
		if(year%4==0) {
			System.out.println("is a leepYear");
		}
		else if(year%100==0) {
			System.out.println("leepyear");
		}
		else if(year%400==0) {
			System.out.println("leepYear");
		}
		else {
			System.out.println("not a leep year");
		}

	}

}
