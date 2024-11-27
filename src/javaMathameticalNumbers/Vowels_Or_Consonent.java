package javaMathameticalNumbers;

import java.util.Scanner;

public class Vowels_Or_Consonent {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the char");
	
		char ch=obj.next().charAt(0);
		System.out.println("enter the number");
		int num=obj.nextInt();
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("vowels");
		}
		else if(num<100) {
			System.out.println("digits");
		}
		else {
			System.out.println("consonent");
		}

	}
	}

