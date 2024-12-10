package constructor;

public class AddTwoConstructors {
	
	
	 AddTwoConstructors(int a,int b) {
		System.out.println("adding in the fisrt calling constructor:"+ (a+  b));
	}
	 AddTwoConstructors(double c,double d){
		 System.out.println("adding the second calling constructor:"+ (c+d));
	 }
	
	public static void main(String[] args) {
		AddTwoConstructors obj=new AddTwoConstructors(50,50);
		AddTwoConstructors obj1=new AddTwoConstructors(50.08,50.7);
		

	}

}
