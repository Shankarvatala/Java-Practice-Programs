package Operators;

public class AND_Operators {

	public static void main(String[] args) {
		 int a=100,res,c = 0;
		 int b=220;
		 int sum=(a+=b);
		 System.out.println(sum);
		 res=(c+a)+b;
		 System.out.println(res);
		 System.out.println(a<res!=res>sum);
		 sum=res+b;
		 System.out.println("updated value of sum "+sum);
		 System.out.println(res);
		 a=res+sum;
		 System.out.println("updated value of a:"+a);
		 System.out.println(a>res || b<sum);
		 System.out.println(res);
		 System.out.println(sum);
		 System.out.println(sum>res^a<b);
		 System.out.println(!(sum>res));
		 
		 
		 
		 

	}

}
