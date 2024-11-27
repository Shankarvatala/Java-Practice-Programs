package contorlStatement;

import java.util.Scanner;

public class String_Convert_Odd_Or_Even {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("string name");
		String s=obj.nextLine();
		System.out.println("string length of word of is shankar length:"+s.length());
		int num=s.length();
		if (num%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}

	}

}
