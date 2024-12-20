package strings;

public class DemoProgram {
	void meth1() {
		// types of declaration of an strings
		String s1="java";
		
		String s2=new String("java");
		
		char arr[]= {'j','a','v','a'};
		String s3=new String(arr);
		
		String s4=new String(arr,1,2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoProgram().meth1();

	}

}
