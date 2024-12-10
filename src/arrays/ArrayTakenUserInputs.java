package arrays;

import java.util.Scanner;

public class ArrayTakenUserInputs {

	void m1() {
		Scanner obj=new Scanner(System.in);
		System.out.println("please enter how many elements you want to store");
		int length=obj.nextInt();
		int[] array=new int [length];
		System.out.println("length of array:"+array.length);
		System.out.println("please enter"+array.length+"elements into the array");
		for(int i=0;i<array.length;i++) {
			array[i]=obj.nextInt();	
		}
		System.out.println("data entered");
		System.out.println("---------------");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);	
		}

	}

	public static void main(String[] args) {
		new ArrayTakenUserInputs().m1();
	}

}
