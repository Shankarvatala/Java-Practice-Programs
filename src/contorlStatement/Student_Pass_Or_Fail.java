package contorlStatement;

import java.util.Scanner;

public class Student_Pass_Or_Fail {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("student pass or fail");
		System.out.println("enter the student hall ticket number");
		long hallTicketNumber=obj.nextLong();
		System.out.println("enter the student marks");
		int StudentMarks=obj.nextInt();
		if (StudentMarks>35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
