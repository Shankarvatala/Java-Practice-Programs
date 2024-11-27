package methods;

public class ClassC {
	int num=5;
	void meth1() {
		if(num%2==0) {
			System.out.println(num + ":even number");
		}
		else {
			System.out.println(num + ":odd number");
		}
		new ClassC().meth2();//{mteh2 called in meth1}
	}
	void meth2() {
		int number=10;
		for(int i=1;i<=number;i++) {
		System.out.println(i+"x"+num+"="+i*num);	
		}
	}

	public static void main(String[] args) {
		System.out.println("check the even or odd numbers");
		new ClassC().meth1();
		//System.out.println("number of table");
		//new ClassC().meth2();

	}

}
