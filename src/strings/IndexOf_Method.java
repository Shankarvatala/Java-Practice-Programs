package strings;

import java.util.Scanner;

public class IndexOf_Method {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name ");
		String name=sc.next();
		String name1="shankar";
		String obj=new String(name);
		System.out.println("printh 5 th of the name");
		System.out.println(obj.charAt(5));
		System.out.println(obj.indexOf('k'));
		

	}

}
