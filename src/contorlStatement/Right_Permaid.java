package contorlStatement;

import java.util.Scanner;

public class Right_Permaid {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the rows");
		int rows=obj.nextInt();
		int num=1;
		for(int i=1;i<=rows;i++) {
			for(int space=i;space<rows;space++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				num++;
			}
			System.out.println();
		}
		

	}

}
