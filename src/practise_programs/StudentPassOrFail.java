package practise_programs;

import java.util.Scanner;

public class StudentPassOrFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentPassOrFail obj = new StudentPassOrFail();
		System.out.println("enter the sudent details");
	
		System.out.println("enter the student hall ticket number");
		int number=sc.nextInt();
		System.out.println("enter the student marks");
		int marks = sc.nextInt();
		if (marks <= 35) {
			System.out.println("just  pass");
		}
		else if(marks<=35|| marks<=50) {
			System.out.println("C grade");
			
		}
		else if(marks<=51 || marks<=65 ) {
			System.out.println("B grade");
			
		}
		else if(marks<=66||marks<=75) {
			System.out.println("B+ grade");
		}
		else if(marks<=76||marks<=90) {
			System.out.println("A grade");
		}
		else if(marks<=91||marks<=100) {
			System.out.println("A+ grade");
		}

		else {
			System.out.println("fail");
		}
	}
}

