package contorlStatement;

import java.util.Scanner;

public class Student_Deatials {

	public static void main(String[] args) {
		Scanner bca = new Scanner(System.in);
		System.out.println("enter the student");
		int student = bca.nextInt();
		System.out.println("enter the hall ticket number");
		long HallTicketNumber = bca.nextLong();

		System.out.println("enter the student name");
		String name = bca.next();
		System.out.println("enter the marks ");
		int StudentMarks = bca.nextInt();
		String c = (StudentMarks >= 35) ? "pass" : "fail";
		//System.out.println("");
		switch (student) {
		case 1:	
			System.out.println("student1");
			System.out.println(name);
			System.out.println(StudentMarks);

			System.out.println(c);
			break;
		case 2:
			System.out.println("student2");
			System.out.println(name);
			System.out.println(StudentMarks);

			System.out.println(c);
			break;
		case 3:
			System.out.println("student3");
			System.out.println(name);
			System.out.println(StudentMarks);

			System.out.println(c);
			break;
		case 4:
			System.out.println("student4");
			System.out.println(name);
			System.out.println(StudentMarks);

			System.out.println(c);
			break;
		case 5:
			System.out.println("student5");
			System.out.println(name);
			System.out.println(StudentMarks);

			System.out.println(c);
			break;
		}
}
}
		
	


