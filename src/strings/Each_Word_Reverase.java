package strings;

import java.util.Scanner;

public class Each_Word_Reverase {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a string");
	String str=obj.nextLine();
	System.out.println("Input:"+str);
	String[]words=str.split(" ");
	
	String Output=new String();
	for(int i=0;i<words.length;i++) {
		String word=words[i];
		String reveraseWord=new String();
		for(int  j=word.length()-1;j>=0;j--) {
		 	reveraseWord+=word.charAt(j);
		}
		if(i!=words.length-1) {
			Output+=reveraseWord+" ";
		}
		else {
			Output+=reveraseWord;
		}
		System.out.println("output:"+Output);
	}
	

	}

}
