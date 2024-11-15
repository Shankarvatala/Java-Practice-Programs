package contorlStatement;

import java.util.Scanner;

public class Student_Marks {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the student");
		int student = obj.nextInt();
		System.out.println("enter the Hall ticket number");
		long HallTicketNumber = obj.nextLong();
		System.out.println("enter student marks");
		int StudentMarks = obj.nextInt();
		Object String = (StudentMarks > 35) ? "pass" : "fail";
		switch (student) {
		case 1:
			System.out.println("student1");
			System.out.println(String);
			break;
		case 2:
			System.out.println("student2");
			System.out.println(String);
			break;
		case 3:
			System.out.println("student3");
			System.out.println(String);
			break;
		case 4:
			System.out.println("student4");
			System.out.println(String);
			break;
		case 5:
			System.out.println("student5");
			System.out.println(String);
			break;

		}

	}

}
