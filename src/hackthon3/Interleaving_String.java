package hackthon3;

import java.util.Scanner;

public class Interleaving_String {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter 1 string");
		String Str1=obj.nextLine();
		System.out.println(Str1.length());
		System.out.println("enter 2nd string");
		String Str2=obj.nextLine();
		System.out.println(Str2.length());
		System.out.println("enter 3rd string");

		if(Str1!=Str2) {

		}
		String Str3=obj.nextLine();
		System.out.println(Str3.length());
		String res=Str1+Str2;
		//System.out.println("res:"+res);
		//System.out.println("res: "+res.length());
		if(res.equals(Str3)) {
			System.out.println("length is matching");
		}
		else {
			System.out.println("length is not matching");
		}
		System.out.println(res.equals(Str3));

	}

}
