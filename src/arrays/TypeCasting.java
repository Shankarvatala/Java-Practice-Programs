package arrays;

public class TypeCasting {
 void method() {
	 int f=65;
	 char[] array;
	 array=new char[(char)f];
	 System.out.println(array.length);
 }
	public static void main(String[] args) {
		new TypeCasting().method();

	}

}
 