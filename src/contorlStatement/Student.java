package contorlStatement;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter 1st student ");
		int student1Marks=obj.nextInt();
		System.out.println("enter 2nd student");
		int student2Marks=obj.nextInt();
		if(student1Marks>35 && student2Marks>35)
		{
			System.out.println("Student1 and Student2 pass");
		}
		else
		{
			if(student1Marks>35 && student2Marks<35)
			{
				System.out.println("student1 passed and student2 failed");
			}
			else if(student1Marks<35 && student2Marks>35)
			{
				System.out.println("student2 passed and student1 failed");
			}
			else
			{
				System.out.println("both are failed");
			}
		}

	}

}	
