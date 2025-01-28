package strings;

import java.util.Scanner;

public class Demo_Program {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println("entre the name");
		String ab=obj.next();
		StringBuffer name= new StringBuffer(ab);
		name.reverse();
		// name=name.toUpperCase();
		System.out.println(name);

	}

}
