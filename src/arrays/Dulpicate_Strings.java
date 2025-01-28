package arrays;

import java.util.Scanner;

public class Dulpicate_Strings {

	public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
     System.out.println("enter the length");
 int name=obj.nextInt();
 obj.nextLine();
   String[]arr=new String[name];
   System.out.println("enter the elements");
   for(int i=0;i<name;i++) {
	 arr[i]=obj.nextLine();
   }
   for(int i=0;i<name;i++) {
	   for(int j=i+1;j<name;j++) {
		   if(arr[i].equals(arr[j])) {
			System.out.println(arr[i]); 
			break;
		   }
	   }
   }
   
	


	}

}
