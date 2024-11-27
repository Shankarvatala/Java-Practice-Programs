package datatypes;

public class Swap_The_Using_With_Exor {

	public static void main(String[] args) {
		// they are ussing in bitwise operator XOR(^);
		
		/*int a=10;
		int b=20;
		a=a^b;
		b=b^a;
		a=a^b;
		System.out.println("after swaping the valus a:"+a);
		System.out.println("after swaping the valus b:"+b  );*/
		
		
		
	//are using in arthametic operator
		//by using in formula is a=(a+b)-(a=b) or b=(a+b)-(a=b)
		int a=2,b=3;
		b=(a+b)-(a=b);
		System.out.println(a);
		System.out.println(b);

	}

}
