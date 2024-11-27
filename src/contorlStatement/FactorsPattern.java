package contorlStatement;

import java.util.Scanner;

public class FactorsPattern {
	public static void main(String args[]) {
		int number;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for(int i=1; ; i++) {
			if(i<=number) {
				if(i%4 == 0) {
					System.out.println("Shankar ");
					
				}
				else {
					System.out.print(i+" ");
				}
			}
			else {
				break;
			}
		}
	}	
}
