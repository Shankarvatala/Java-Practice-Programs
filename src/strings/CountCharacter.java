package strings;

import java.util.Scanner;

public class CountCharacter {
	public void show() {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the string name");
		String name=obj.nextLine();
		int count=0;

		//count character except space
		for(int i=0;i<name.length();i++ ) {
			if(name.charAt(i)!=' ') 


				count++;
		}
		System.out.println("total number of caharacters is :"+count);
	}
	public static void main(String[] args) {
		new CountCharacter().show();
		//obj.show();
	}

}
