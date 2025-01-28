package hackthon2;

import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the rows");
		int rows=obj.nextInt();
		System.out.println("enter the col");
		int col=obj.nextInt();
		int[][] arr=new int[rows][col];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
			arr[i][j]=obj.nextInt()	;
			}
		}
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		int[]Daigonal=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			Daigonal[i]=arr[i][i];
		}
		for(int result:Daigonal) {
			System.out.println(result);
		}
		int Primary=0;
		int SecondPrimary=0;
		for(int i=0;i<rows;i++) {
			Primary+=arr[i][i];
			SecondPrimary+=arr[i][col-i-1];
			
		}
		System.out.println(Primary);
		System.out.println(SecondPrimary);
		
		

	}

}
