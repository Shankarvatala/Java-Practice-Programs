package contorlStatement;
import java.util.Scanner;
public class Demo {

	//public static void main(String[] args) {
		//package contorlStatement;

		//import java.util.Scanner;

		//public class Student_Deatials {

		   public static void main(String[] args) {
		        Scanner bca = new Scanner(System.in);

		        System.out.println("Enter the number of students:");
		        int numberOfStudents = bca.nextInt();

		        for (int i = 1; i <= numberOfStudents; i++) {
		            System.out.println("Enter details for student " + i + ":");
		            
		            System.out.println("Enter the hall ticket number:");
		            long hallTicketNumber = bca.nextLong();
		            
		            System.out.println("Enter the student name:");
		            String name = bca.next();
		            
		            System.out.println("Enter the marks:");
		            int studentMarks = bca.nextInt();
		            
		            String status = (studentMarks >= 35) ? "Pass" : "Fail";

		            System.out.println("Details of student " + i + ":");
		            System.out.println("Name: " + name);
		            System.out.println("Hall Ticket Number: " + hallTicketNumber);
		            System.out.println("Marks: " + studentMarks);
		            System.out.println("Status: " + status);
		            System.out.println("--------------------------");
		        }
		   }}
		


	


