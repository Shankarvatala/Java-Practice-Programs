package javaMathameticalNumbers;

import java.util.Scanner;

public class Reverase_Factorial_Number {

	public static void main(String[] args) {
				 
		        int inputFactorial = 120; 
		        int fact = 1; 
		        int number = 1; 
		        
		       
		        for (int i = 1; i <= inputFactorial; i++) {
		            fact *= i; 
		            if (fact == inputFactorial) { 
		                number = i;
		                break;
		            } else if (fact > inputFactorial) { 
		                number = -1;
		                break;
		            }
		        }

		        if (number == -1) {
		            System.out.println("The input number " + inputFactorial + " is not a factorial of any integer.");
		        } else {
		            System.out.println("The input factorial " + inputFactorial + " corresponds to the number: " + number);
		        }
		    }
		}

		      

		

	


