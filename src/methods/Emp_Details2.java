package methods;

import java.util.Scanner;

public class Emp_Details2 {
	void display() {
		
	Scanner sc=new Scanner(System.in);
	 Emp_Details2 obj=new  Emp_Details2();
	System.out.println(" EmpName");
	//obj.setEmpName(sc.nextLine());
	String EmpName=sc.nextLine();
	
	System.out.println("EmpId");
	int EmpId=sc.nextInt();
	
	System.out.println("EmpSalary");
	int EmpSalary=sc.nextInt();
	
	//System.out.println("employee name:"+sc.getEmpName());
	//  System.out.println("employee id :"+sc.getEmpId);
	//System.out.println("employee salary:"+sc.getEmpSalary):
	
	}
	public static void main(String[] args) {
		System.out.println("FILL THE EMPOLYEE DETAILS");
		new Emp_Details2().display();
	

	}

}
