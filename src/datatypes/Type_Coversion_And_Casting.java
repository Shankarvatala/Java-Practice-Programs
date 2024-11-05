package datatypes;

public class Type_Coversion_And_Casting {

	public static void main(String[] args) {

		// conversion byte to integer

		// byte b=127;
		int a = 30000;
		byte y = (byte) a;
		System.out.println(a);

		// conversion float to integer
		float f = 10.100f;
		int t = (int)f;
		System.out.println(t);
		
		//type promotions
		byte b=10;
		byte c=30;
		int res=b*c;
		System.out.println("type promotions is 	:"+res);
		
		
		

	}

}
