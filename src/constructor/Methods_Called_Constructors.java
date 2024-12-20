package constructor;

public class Methods_Called_Constructors {
	
	Methods_Called_Constructors(String name, int i,long n) {
		System.out.println("name : "+name);
		System.out.println("age : "+i);
		System.out.println("PhoneNumber : "+n);
	}
	void display(String name, int i,long n) {
		 
		 System.out.println("shankar");
	}

	public static void main(String[] args) {
		Methods_Called_Constructors obj=new  Methods_Called_Constructors("shankar", 24,934660159 );

	}

}
