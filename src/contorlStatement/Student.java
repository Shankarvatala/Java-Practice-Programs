package contorlStatement;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter 1st student ");
		int student1Marks=obj.nextInt();
		System.out.println("enter 2nd student");
		int student2Marks=obj.nextInt();
		
		System.out.println("1st student result");
		if(student1Marks>35) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		System.out.println("2nd student result");
		if(student2Marks>35) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}

	}

}
