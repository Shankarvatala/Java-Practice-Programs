package arrays;

import java.util.Scanner;

public class Methods_AddTwoMatrix {

	public static void main(String[] args) {
	 Scanner obj=new Scanner(System.in);

		System.out.println("entre rows");
		int rows=obj.nextInt();
		System.out.println("enter columns");
		int columns=obj.nextInt();
		int[][]a=new int[rows][columns];
		int[][]b=new int[rows][columns];
		int[][]c=new int[rows][columns];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				a[i][j]=obj.nextInt();
				//System.out.print(a[i][j]+" ");
			}
			//System.out.println();
			
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				b[i][j]=obj.nextInt();
				//System.out.print(b[i][j]+" ");
			}
			//System.out.println();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
