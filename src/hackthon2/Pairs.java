package hackthon2;

import java.util.Scanner;

public class Pairs {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the length");
		int a=obj.nextInt();

		int CurrentProduct=1;
		int result=0;
		int result1=0;
		int[]arr=new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=obj.nextInt();

		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {

				if(CurrentProduct<arr[i]*arr[j]) {
					CurrentProduct=arr[i]*arr[j] ;

					result=arr[i];
					result1=arr[j]; 
				}
			}

		}
		System.out.println("("+result+","+result1+")");
		System.out.println(CurrentProduct);

	}

}




