package arrays;

import java.util.Scanner;

public class Matrix4X4_AreUsingMethods {
	void method() {
		Scanner obj=new Scanner(System.in);
		System.out.println("entr the a rows");
		int a=obj.nextInt();
		System.out.println("enter the b colums");
		int b=obj.nextInt();
		int[][] arr=new int[a][b];
		System.out.println("length of array:"+arr.length);
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr[i][j]=obj.nextInt();
			}
			
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new  Matrix4X4_AreUsingMethods().method();
	}

}
