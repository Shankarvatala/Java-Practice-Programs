package constructor;

import java.util.Scanner;
  
public class Bank2 extends Bank {

	public static void main(String[] args) {
		Bank obj=new Bank();
	Scanner sc=new Scanner(System.in);
	System.out.println("FILL THE CASH WITH DRAW FORM");
	System.out.println("Fill the Account Number");
	long AccountNumber=sc.nextLong();
	obj.setAccountNumber(AccountNumber);
	System.out.println("Fill the AccountHolderNme");
	String AccountHolderNme=sc.next();
	obj.setAccountHolderNme(AccountHolderNme);
	System.out.println("Fill the Date");
	String Date=sc.next();
	obj.setDate(Date);
	System.out.println("Fill the withdraw Amount");
	int WidtdrawhAmount=sc.nextInt();
	obj.setWidtdrawhAmount(WidtdrawhAmount);
	System.out.println("Account Number:"+obj.getAccountNumber());
	System.out.println("Account Holder Nme:"+obj.getAccountHolderNme());
	System.out.println("Date:"+obj.getDate());
	System.out.println("enter WidtdrawhAmount: "+obj.getWithdrawAmount());
	
	

	}

}
