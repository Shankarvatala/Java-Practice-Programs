
package methods;
import java.util.Scanner;

public class Setter_And_Getter1 
{
	public static void main(String[] args) 
	{
		
		Setter_And_Getters obj = new Setter_And_Getters();
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


