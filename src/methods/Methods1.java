package methods;

import java.util.Scanner;

public class Methods1  {
	private String Panchayatseva;
	private String Rupid;
	private String Elitical;
	
	public String getPanchayatseva() {
		return Panchayatseva;
	}

	public void setPanchayatseva(String panchayatseva) {
		this.Panchayatseva = panchayatseva;
	}
	public String getRupid() {
		return Rupid;
	}

	public void setRupid(String rupid) {
		this.Rupid = rupid;
	}
	public String getElitical() {
		return Elitical;
	}
	public void setElitical(String elitical) {
		this.Elitical = elitical;
	}
	void Project1() {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the project name:");
	String Name=obj.next();
	System.out.println("How many members in project : ");
	int members=obj.nextInt();
	for(int i=0;i<members;i++) {
		System.out.println("Enter  Employee ID:");
		int EmpId=obj.nextInt();
		System.out.println("enter employee name:");
		String EmpName=obj.next();
		System.out.println("enter employee domin:");
		String EmpDomin=obj.next();
		
		System.out.println("Employee ID:"+EmpId);
		System.out.println("EmpName:"+EmpName);
		System.out.println("EmpDomin:"+EmpDomin);
		
	}
	
	
	}
	void  Project2() {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the project name:");
		String Name=obj.next();
		System.out.println("How many members in project : ");
		int members=obj.nextInt();
		for(int i=0;i<members;i++) {
			System.out.println("Enter  Employee ID:");
			int EmpId=obj.nextInt();
			System.out.println("enter employee name:");
			String EmpName=obj.next();
			System.out.println("enter employee domin:");
			String EmpDomin=obj.next();
			
			System.out.println("Employee ID:"+EmpId);
			System.out.println("EmpName:"+EmpName);
			System.out.println("EmpDomin:"+EmpDomin);
			
		}
		
		
	}
	void Project3() {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the project name:");
		String Name=obj.next();
		System.out.println("How many members in project : ");
		int members=obj.nextInt();
		for(int i=0;i<members;i++) {
			System.out.println("Enter  Employee ID:");
			int EmpId=obj.nextInt();
			System.out.println("enter employee name:");
			String EmpName=obj.next();
			System.out.println("enter employee domin:");
			String EmpDomin=obj.next();
			
			System.out.println("Employee ID:"+EmpId);
			System.out.println("EmpName:"+EmpName);
			System.out.println("EmpDomin:"+EmpDomin);
			
		}
	}
	public static void main(String[] args) {
		Methods1 sc=new Methods1();
		sc.Project1();
		sc.Project2();
		sc.Project3();
	}
}
