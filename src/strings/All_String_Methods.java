package strings;

import java.util.Scanner;

public class All_String_Methods {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the 1st string name: ");
		String name=obj.nextLine();
		System.out.println("enter the 2nd string name:");
		String name1=obj.nextLine();
		//equal method
		System.out.println("equal: "+name.equalsIgnoreCase( name1));
		//toUpperCase method
	    System.out.println("toUpperCase:"+name.toUpperCase());
	    //toLowerCase method
        System.out.println("toLowerCase:"+name1.toLowerCase());
        //== methods  
        System.out.println("==:"+name1==name);
        //Contains method
        System.out.println("Contains:"+name.contains(name1));
        //Length method
        System.out.println("length:"+name.length() );
        //chartAt methods
        System.out.println("chartAt:"+name1.charAt(5));
        //split method
        System.out.println("split:"+name.split(name1));
        
	}
}
