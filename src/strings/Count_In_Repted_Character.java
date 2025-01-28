package strings;

import java.util.Scanner;

public class Count_In_Repted_Character {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the string ");
		String input=obj.nextLine();
		System.out.println("enter the target character:");
		char targetChar=obj.next().charAt(0);
		System.out.println("Target character:"+targetChar);
		
		char[]character=input.toCharArray();
		int count=0;
		for(int i=0;i<character.length;i++) {
			if(character[i]==targetChar) {
				count++;
			}
				
		}
		System.out.println("Output:"+count);

	}

}
