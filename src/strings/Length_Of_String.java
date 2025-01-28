package strings;

import java.util.Scanner;

public class Length_Of_String {
 
	public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the string name:");
    String name=obj.nextLine();
    System.out.println(name.length());
    String 	WithOutSpaces=name;
    System.out.println("after trim: ");
    System.out.println(WithOutSpaces.trim().toUpperCase());

	}
}
