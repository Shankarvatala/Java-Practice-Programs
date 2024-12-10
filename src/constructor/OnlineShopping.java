package constructor;

import java.util.Scanner;

public class OnlineShopping {
	private long DebitCard;
	private long CreditCard;
	private String UPI;
	public long getDebitCard(){
		return DebitCard;
	}
	public void setDebitCard(long DebitCard) {
		this.DebitCard=DebitCard;
	}
	public long getCreditCard() {
		return CreditCard;
	}
	public void setCreditCard(long CreditCard) {
		this.CreditCard=CreditCard;
	}
	public String getUPI() {
		return UPI;
	}
	public void setUPI(String UPI)	{
		this.UPI=UPI;
	}
	
	//CREATING A METHOD 
	
	void paybill() {
		OnlineShopping	obj=new OnlineShopping();
		Scanner sc=new Scanner(System.in);
		System.out.println("choose the one option");
		String choose=sc.next();
		
		
		switch(choose) {
		case "DebitCard":
			System.out.println("Debit Card");
			System.out.println("enter the debit card number");
			long debitCard=sc.nextLong();
			System.out.println("enter the CVV NUMBER");
			String CvvNumber=sc.next();
			System.out.println("enter the otp ");
		    short OTP=sc.nextShort();
		    System.out.println("enter the PIN");
		    short PIN=sc.nextShort();
		    System.out.println("Thank your Payments is Successfully COMPLETED");
		    break;
		case "CreditCard":
			System.out.println("Credit Card");
			System.out.println("enter the debit card number");
			long CreditCard=sc.nextLong();
			System.out.println("enter the CVV NUMBER");
			String cvvnumber=sc.next();
			System.out.println("enter the otp ");
		    short otp=sc.nextShort();
		    System.out.println("enter the PIN");
		    short pin=sc.nextShort();
		    System.out.println("Thank your Payments is Successfully COMPLETED");
		    break;
		case "UPI":
			System.out.println("UPI Payments");
			String option=sc.next();
			switch(option) {
			case "Gpay":
				System.err.println("enter the pin ");
				int Gpaypin=sc.nextInt();
				System.out.println("Thank your Payments is Successfully COMPLETED");
				break;
			case "phonepay":
				System.out.println("enter the pin");
				int phonepaypin=sc.nextInt();
				System.out.println("Thank your Payments is Successfully COMPLETED");
				break;
			case "ptm":
				System.out.println("enter the pin ");
				int ptmpin=sc.nextInt();
				System.out.println("Thank your Payments is Successfully COMPLETED");
				break;
			}
			break;
			
			default :
				System.out.println("invalid choose");
			
		}
		
		
	}
	public static void main(String[] args) {
		OnlineShopping obj1=new OnlineShopping();
		obj1.paybill();
			}

}
