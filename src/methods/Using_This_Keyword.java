package methods;

import java.util.Scanner;

public class Using_This_Keyword {
    String StudentName="shankar";
    int StudentMarks=88;
    char StudentGrade='A';
    void studentDetails() {
//    	Scanner obj=new Scanner(System.in);
//    	 System.out.println("enter the Student name");   	
//    	 System.out.println(obj.nextLine());
//    	 System.out.println("enter the student marks");
//    		System.out.println(obj.nextInt());
//    		System.out.println("enter the student grade");
//    		 System.out.println("enter the student marks");
//    			System.out.println(obj.nextInt());
//    			System.out.println("enter the student grade");
//    			System.out.println(obj.next().charAt(0));
    	System.out.println("enter the Student name::"+this.StudentName);
    	System.out.println("enter the student grade::"+this.StudentGrade);
    	System.out.println("enter the student marks::"+this.StudentMarks);
    	
    
    }

	public static void main(String[] args) {
  
	new Using_This_Keyword().studentDetails();
	}

}
