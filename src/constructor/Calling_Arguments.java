package constructor;

public class Calling_Arguments {
	Calling_Arguments (){
		
		System.out.println("hello constrctors");
	}
	Calling_Arguments (int a,int b){
		this();
		System.out.println("calling method from anoter constructors");
		System.out.println("sum of:"+(a+b));
		
	}
	Calling_Arguments (double c,int d){
		this();
		System.out.println("results of:"+(c+d));
	}

	public static void main(String[] args) {
		Calling_Arguments obj=new Calling_Arguments (20,20);
		Calling_Arguments obj1=new Calling_Arguments (27.8,73);
		
	}

}
