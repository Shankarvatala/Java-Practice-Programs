package methods;

import java.util.Scanner;

public class Class_A {
		int meth1(int StudentHallaTicket ) {
			System.out.println("enter the Student Hall Ticket Number");
			return 40952;
		}
	static void meth2(int hallticket)	{
		if (hallticket== 40952) {
	String name="shankar";
		String  subj="tel,eng,mat,ps,scl";
		int marks=66;
		String c=(marks>35)?"pass":"fail";
		  System.out.println("Name: " + name); 
          System.out.println("Subjects: " + subj);
          System.out.println("Marks: " + marks);
          System.out.println("Result: " + c);

         
      } else {
          System.out.println("Invalid Hall Ticket Number.");
		
		}
	}
	public static void main(String[] args) {
		System.out.println(" student result is");
		Class_A obj=new Class_A();
		//System.out.println("Student result is:");
        //Class_A obj = new Class_A();

        // Get the hall ticket number
        int hallTicket = obj.meth1(40952);

        // Display student details
        obj.meth2(hallTicket);
		
		//System.out.println(obj.meth1(40952));
		
	}

}
