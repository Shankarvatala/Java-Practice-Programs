package Operators;

import java.util.Scanner;

public class Rectangle_Of_Height_Value {

	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		System.out.println("hegihest value of length and width");
		System.out.println("length value is  ");
		float length=obj.nextFloat();
		System.out.println("width value is");
		float width=obj.nextFloat();
		float area=(length>width)?length:width;
		
		String res=(length>width)?"length"+length:"width"+width; //(initilization of String )
		System.out.println(res );
		//System.out.println("width:"+area);
		//System.out.println(res);
		

	}

}
