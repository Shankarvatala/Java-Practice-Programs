package thisKeyword;

public class This_Using_MethodsAreCallingArguments {
	void method1(This_Using_MethodsAreCallingArguments obj) {
		System.out.println("method called");
	}
	void display() {
		method1(this);
	}
	public static void main(String[] args) {
		This_Using_MethodsAreCallingArguments obj=new This_Using_MethodsAreCallingArguments ();		
obj.display();
	}

}
 