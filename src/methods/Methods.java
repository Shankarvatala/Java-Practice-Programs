package methods;

import java.util.Scanner;

public class Methods {
	private String CompanyName;

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		this.CompanyName = companyName;
	}
	 void display() {
		 Methods sc=new Methods();
		 Scanner obj=new Scanner(System.in);
		 System.out.println("enter the CompanyName");
		 String CompanyName=obj.next();
		 sc.setCompanyName(CompanyName);
		 System.out.println("CompanyName:"+sc.getCompanyName());
		 int projects=3;
		for(int i=0;i<=projects;i++) {
			System.out.println("enter the project name:");
			String projectName=obj.next();
			 
			System.out.println("projectName:"+projectName);
			 
		 }
		
	 }
	 public static void main(String[] args) {
		 new Methods().display();
		
	}
	
	

}
