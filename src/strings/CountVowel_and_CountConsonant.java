package strings;

import java.util.Scanner;

public class CountVowel_and_CountConsonant {

	public static void main(String[] args) {
		int VowelCount=0;
		int ConsonantCount=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("please enter the text ");
		String text=obj.nextLine();
		text=text.toLowerCase();
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='i'||text.charAt(i)=='o'||text.charAt(i)=='u') {
				VowelCount++;
			}
			else if(text.charAt(i)>='a'&&text.charAt(i)<='z') {
				ConsonantCount++;
				
			}
			
		}
		System.out.println("number of vowel counts :"+VowelCount);
		System.out.println("number of consonat counts :"+ConsonantCount);

	}

}
