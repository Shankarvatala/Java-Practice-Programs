package javaMathameticalNumbers;

import java.util.Scanner;

public class Fabonacci_Series {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the number");
		int num = obj.nextInt();
		int n1 = 0, n2 = 1, n3, i;

		for (i = 2; i < num; ++i) {

			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
