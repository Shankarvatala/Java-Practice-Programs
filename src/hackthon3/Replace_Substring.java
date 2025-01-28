package hackthon3;

import java.util.Scanner;

public class Replace_Substring {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a string ");
		String string=obj.nextLine();
		System.out.println("enter a substring");
		String Substring=obj.nextLine();
		System.out.println("enter the replce String ");
		String replaceString=obj.nextLine();
		System.out.println(string.replace(Substring, replaceString));

	}

}
