package Operators;

import java.util.Scanner;

public class Eligiable_For_VoterId {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the person age :");
		int age=obj.nextInt();
		String result=(age>18)?"Eligiable for vote :"+age:"Not Eligiable for vote:"+age;
		System.out.println(result);

	}

}
