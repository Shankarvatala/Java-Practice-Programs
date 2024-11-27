package methods;

public class ClassB {

   void meth1() {
	  int row=5;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
			
		}
		System.out.println();
		
	}

	}

public static void main(String []args) {
	new ClassB().meth1();
	
}
}