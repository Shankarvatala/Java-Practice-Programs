package methods;

public class Demo {
	void meth1() {
    System.out.println("hello");
	}
	void meth2() {
		System.out.println("sayukth");
	}

	public static void main(String[] args) {
   Demo obj=new Demo();
   Demo obj1=new Demo();
   Demo obj2=new Demo();
   Demo obj3=new Demo();
   Demo obj4=new Demo();
   Demo obj5=new Demo();
   Demo obj6=new Demo();
		   
   
   obj.meth1();
   obj2.meth1();
   obj3.meth1();
   obj1.meth2();
   obj1.meth1();
   obj1.meth1();
	}

}
