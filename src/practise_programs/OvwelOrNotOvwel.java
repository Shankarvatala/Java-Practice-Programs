package practise_programs;

import java.util.Scanner;

public class OvwelOrNotOvwel {

	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	  System.out.println("enter the alaphbet"); 
	  char ch = obj.next().charAt(0);
	    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
	   
	    	
	    }

	}


