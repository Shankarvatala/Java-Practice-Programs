package Operators;

public class Equal_To {

	public static void main(String[] args) {
      //== equal to the integer  datatype
		int a=446;
		int b=888;
		int c=446;
		System.out.println("integer  datatype");
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(c==a);
		
		//==equal to the character datatype
		System.out.println("character datatype");
		char FirstLetter='b';
		char MiddleLetter='s';
		char LastLetter='r';
		System.out.println( FirstLetter==MiddleLetter);
		System.out.println(MiddleLetter==LastLetter);
		System.out.println(LastLetter==FirstLetter);
		
		//==equal to the float datatype
		System.out.println("float datatype");
		float num=454;
		float num2=555;
		float num3=545;
		System.out.println(num==num2);
		System.out.println(num2==num3);
		System.out.println(num3==num2);
		
		//==equal to the double datatype 
		System.out.println("double datatype ");
		double tem=5.9;
		double tem2=5.9;
		double tem3=5.9;
		System.out.println(tem==tem2);
		System.out.println(tem2==tem3);
		System.out.println(tem3==tem);

	

	}

}
