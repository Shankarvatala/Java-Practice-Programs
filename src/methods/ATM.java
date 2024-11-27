package methods;

import java.util.Scanner;

public class ATM {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Initialize balance and options
		double balance = 1000.0; // Starting balance
		int choice;

		System.out.println("Welcome to the ATM!");

		// Loop for menu-driven operations
		do {
			System.out.println("\nPlease choose an option:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");

			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1: // Check Balance
				System.out.println("Your current balance is: $" + balance);
				break;

			case 2: // Deposit Money
				System.out.print("Enter the amount to deposit: $");
				double depositAmount = scanner.nextDouble();
				if (depositAmount > 0) {
					balance += depositAmount;
					System.out.println("Successfully deposited $" + depositAmount);
					System.out.println("Your new balance is: $" + balance);
				} else {
					System.out.println("Invalid deposit amount. Please enter a positive value.");
				}
				break;

			case 3: // Withdraw Money
				System.out.print("Enter the amount to withdraw: $");
				double withdrawAmount = scanner.nextDouble();
				if (withdrawAmount > 0 && withdrawAmount <= balance) {
					balance -= withdrawAmount;
					System.out.println("Successfully withdrew $" + withdrawAmount);
					System.out.println("Your remaining balance is: $" + balance);
				} else if (withdrawAmount > balance) {
					System.out.println("Insufficient funds. Your balance is: $" + balance);
				} else {
					System.out.println("Invalid withdraw amount. Please enter a positive value.");
				}
				break;

			case 4: // Exit
				System.out.println("Thank you for using the ATM. Goodbye!");
				break;

			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}
		} while (choice != 4); // Continue until the user chooses to exit

		scanner.close();
	}
}
