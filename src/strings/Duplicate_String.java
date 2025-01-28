package strings;

import java.util.Scanner;

public class Duplicate_String {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the name");
		String name=obj.nextLine();
		int count;
		char String[]=name.toCharArray();
		System.out.println("Duplicate characters in string :");
		for(int i=0;i<String.length;i++) {
			count=1;
			for(int j=i+1;j<String.length;j++) {
				if(String[i]==String[j] && String[i]!=' ') {
					count++;
					String[j]='0';
				}
			}
			if(count>1 && String[i]!='0') {
				System.out.println(String[i]);
			}
			
		}
		
	}

}
