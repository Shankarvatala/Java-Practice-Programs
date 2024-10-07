package practise_programs;

import java.util.Scanner;

public class OddOrEvenNumber {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("find the even or odd number");
		int number=obj.nextInt();
		if( number%2==0) { 
			System.out.println("even number");
			System.out.println(number);
			
		}
		else {
			System.out.println("odd number");
			System.out.println(number);
		}
	}

}
