package Operators;


import java.util.Scanner;

public class Area_Of_Rectangle {
	float length;
	float width;
	//static float area;

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("value of the length is:");
		float length=obj.nextFloat();
		System.out.println("value of the width is:");
		float width=obj.nextFloat();
		//System.out.println("value of the area is :");
		//float area=obj.nextFloat();
	boolean area=(length==width);
		System.out.println("the equals of length and width :"+ area);
		



	}

}
