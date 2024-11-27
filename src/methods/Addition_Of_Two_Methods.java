package methods;

public class Addition_Of_Two_Methods {
	int add() {
		int a=1;
		System.out.println("a value is :"+a);
	     //System.out.println("shankar");
		return a;
	}
	static int sub() {
		int b=99;
		System.out.println("b value is :"+b);
		  return b;
	}

	public static void main(String[] args) {
		
     System.out.println("the sum add and sub");
     Addition_Of_Two_Methods obj=new Addition_Of_Two_Methods();
     int a= obj.add();
     int b= Addition_Of_Two_Methods.sub();
      int sum=a+b;
      int res=sum-b;
      System.out.println("addition of two methods a+b is:"+sum);
      System.out.println("subtraction  of two methods is:"+res);
	}

}
