package contorlStatement;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		Scanner bca = new Scanner(System.in);
		System.out.println("enter the number of students");
		int NumberOfStudent = bca.nextInt();
		
		for (int i = 1; i <= NumberOfStudent; i++) {
			System.out.println("enter student details" + i + ":");
			
			System.out.println("enter the hall ticket number");
			int HallTicketNumber = bca.nextInt();
			
			System.out.println("enter the student name");
			String Name = bca.next();
			
			System.out.println("enter the student marks");
			int StudentMarks = bca.nextInt();
			
			String status = (StudentMarks >= 35) ? "pass" : "fail";
			
			System.out.println("student details" + i + ":");
			System.out.println(" hallticket number:" + HallTicketNumber);
			System.out.println(" name:" + Name);
			System.out.println(" student marks:" + StudentMarks);
			System.out.println("status:" + status);
			// bca.close();
		}

	}
}
