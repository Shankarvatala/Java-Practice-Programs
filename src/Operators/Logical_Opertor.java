package Operators;

public class Logical_Opertor {

	public static void main(String[] args) {
		// &&(AND) Operators
		int a = 45;
		int b = 4;
		System.out.println("AND Operator");
		System.out.println(a >= b && b >= a);
		System.out.println(a <= b && b <= a);

		// || (OR) Operators
		double c = 18;
		double d = 9;
		System.out.println("OR Operator");
		System.out.println(a >= b || b >= a);
		System.out.println(a <= b || b <= a);
		
		//! (NOT) Operator
		int e = 45;
		int f = 4;
		System.out.println("NOT Operator");
		System.out.println(e>f != f>c);
	}

}
