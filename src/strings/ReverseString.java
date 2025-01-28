package strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a  string");
		String name=obj.nextLine();
		
		String reversed=new String();
		for(int i=name.length()-1;i>=0;i--) {
			reversed+=name.charAt(i);
		}
		System.out.println("Rveresed string:"+reversed);

	}

}
