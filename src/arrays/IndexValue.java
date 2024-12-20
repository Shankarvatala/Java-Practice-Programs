package arrays;

import java.util.Scanner;

public class IndexValue {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("array size:");
		int array=obj.nextInt();
		int[] arraySize=new int [array];
		System.out.println("the length of the array size :"+arraySize.length);
		for(int i=0;i<array;i++){
			System.out.print("index value is:");
		  arraySize[i] =obj.nextInt();
			}
		for (int i=0;i<array;i++) {
			System.out.println(arraySize[i]);
		}
		System.out.println("i want to 5th index value of the array:"+arraySize[5]);

	}

}
