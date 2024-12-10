package constructor;

public class MethodsAndConstructors {
	int d(int a,int b) {
	
		return  a+b;
	}
	
	MethodsAndConstructors(int name){
		System.out.println(name);
	}
	public static void main(String[] args) {
		MethodsAndConstructors obj=new MethodsAndConstructors(9950);
		System.out.println("method return type is :"+obj.d(50, 60));
	
	}
}
