package methods;

import java.util.Scanner;

public class ATM_Program_Pratice {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		double balance=5000.5;
		int choice;
		System.out.println("Welcome to the ATM!!");
		do {
			System.out.println("\n select the one option");
			System.out.println("check the balance ");
			System.out.println("deposit amount");
			System.out.println("withdraw amount");
			System.out.println("exist");
			
			System.out.println("Enter your choice:");
			choice =obj.nextInt();
			switch(choice){
			case 1://check balance
				System.out.println("your current balance:"+balance);
				break;
			case 2://deposit amount
				System.out.println("pelease enter the DepositAmount");
				double DepositAmount=obj.nextDouble();
				if(DepositAmount>0) {
					balance+=DepositAmount;
					System.out.println("amount successfully deposited :"+DepositAmount);
					System.out.println("your current balance is:"+balance);
				}else {
						System.out.println("please deposite the positive values");
				}
				break;
			case 3://withdraw amount
				System.out.println("please enter the amount");
				double withdrawAmount=obj.nextDouble();
				if(withdrawAmount>0 && withdrawAmount<=balance){
					balance-=withdrawAmount;
				System.out.println("your amount successfully withdraw:"+withdrawAmount);
				System.out.println("your current balance is :"+balance);
				}
				else if(withdrawAmount>balance) {
					System.out.println("your balance is insuffiest fonds"+balance);
				}
				else {
					System.out.println("invalid withdraw amount .please enter positive");
				
					
				}
				break;
			case 4://exist
				System.out.println("Thank you for using the ATM. Goodbye!");
				break;
				 
			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}
		}while(choice !=4);
		obj.close();
		
					
				}
		
	
				
			
}	
		
	


