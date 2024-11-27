package javaMathameticalNumbers;

import java.util.Scanner;

public class SPY_Number {
 public static void main(String[] args) {
	int num,sum=0,product=1,lastdigist;
	Scanner abc=new Scanner(System.in);
	System.out.println("enter the SPY number");
	 num=abc.nextInt();
	 while(num>0) {
		 lastdigist=num%10;
		 sum=sum+lastdigist;
		 product=product*lastdigist;
		 num=num/10;
	 }
	 if(sum==product) {
	 System.out.println("SPY NUNBER");
	 }
      else {
	 System.out.println("NOT SPY NUMBER");
 }
}
}
