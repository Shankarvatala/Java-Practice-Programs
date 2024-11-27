package contorlStatement;

import java.util.Scanner;

public class String_Add_TwoString {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the first name ");
		String name=obj.nextLine();
		System.out.println("enter the 2nd name");
		String name2=obj.nextLine();
		System.out.println("enter the 3rd name");
		String name3=obj.nextLine();
		System.out.println("enter the first name length :"+name.length());
		System.out.println("enter the 2nd name length:"+name2.length());
		System.out.println("enter the 3rd name"+name3.length());
		int num=name.length();      //type casting and type conversion
		int num2=name.length();      //type casting and type conversion
		int num3=name.length();
		int sum=num+num2;
		
		System.out.println("sum:"+sum);
		int result=num3*sum;
		System.out.println("result:"+result);

	}

}
