package opps;

import java.util.Scanner;

//import methods.Setter_And_Getters;

public class Sub_Class extends Main_Class {

	public static void main(String[] args) {
		Sub_Class obj = new Sub_Class();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name:");
		String name = sc.nextLine();
		obj.setStudentName(name);
		System.out.println("Enter student roll no:");
		int rollno = sc.nextInt();
		obj.setStudentRollNumber(rollno);
		System.out.println(obj.getStudentName());
		System.out.println(obj.getStudentRollNumber());

	}

}
