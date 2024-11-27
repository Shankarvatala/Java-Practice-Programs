package methods;

public class This_Keyword {
	int a=10;
	static int b=20;
	void meth1() {
		int c=30;
	System.out.println("instance variable:"+this.a);
	System.out.println("static variables:"+This_Keyword.b);
	System.out.println("local variables:"+c);
	}

	public static void main(String[] args) {
		
		new This_Keyword().meth1(); 
		

	}

}
