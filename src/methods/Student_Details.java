package methods;

import java.util.Scanner;

public class Student_Details {

	public static void main(String[] args) {

		Scanner abc=new Scanner(System.in);
		System.out.println("collage top rank students");
		System.out.println("enter collage name");
		//long HallTicketNumber=abc.nextLong();
		String CollageName=abc.nextLine();
	
		
		int choice;
	do {
		System.out.println("\n please one optin");
		System.out.println("1 studenet ");
		System.out.println("2 student");
		System.out.println("3 student ");
		System.out.println("4 student");
		
		
		System.out.println("select the student");
		choice=abc.nextInt();
		
		switch(choice) {
		case 1://1 student
			System.out.println("enter the hall ticket number");
			long HallTicketNumber=abc.nextLong();
			System.out.println("enter the 1 student");
			int s1Marks=abc.nextInt();
			if(s1Marks<1000) {
				System.out.println("shankar");
				System.out.println("1 st RANK ");
			}
			else {
				System.out.println("enter the valid marks");
			}
			break;
		case 2://2 student
			System.out.println("enter the hall ticket number");
			long HallTicketNumber2=abc.nextLong();
			System.out.println("enter the 2 student");
			int s2Marks=abc.nextInt();
			if(s2Marks<1000) {
				System.out.println("preethi");
				System.out.println("2 nd RANK");
			}
			else {
				System.out.println("enter the valid marks");
			}
			break;
		case 3://3 student
			System.out.println("enter the hall ticket number");
			long HallTicketNumber3=abc.nextLong();
			System.out.println("enter the 3 student");
			int s3Marks=abc.nextInt();
			if(s3Marks<1000) {
				System.out.println("vamsi");
				System.out.println("3 rd RANK");
			}
			else {
				System.out.println("enter the valid marks");
			}
			break;
		case 4://4 student
			System.out.println("enter the hall ticket number");
			long HallTicketNumber4=abc.nextLong();
			System.out.println("enter the 4 student");
			int s4Marks=abc.nextInt();
			if(s4Marks<1000) {
				System.out.println("satya");
				System.out.println("4 th RANK");
			}
			else {
				System.out.println("enter the valid marks");
			}
			break;
			default:
				System.out.println("please select of the option");
		
		}
	
	
	
	}while(choice !=4);
	abc.close();
}
	}
