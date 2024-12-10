package arrays;

import java.util.Scanner;

public class ForEachArray {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int length=obj.nextInt();
		int[]array=new int[length];//creating an  array object
		System.out.println("length of the array:"+array.length);
		for(int x:array) {  //for each loop 
			System.out.println(x);
		}

	}

}
