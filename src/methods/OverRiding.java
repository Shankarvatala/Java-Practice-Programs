package methods;

public class OverRiding {
	void display(int a , int b) {
		System.out.println(a+b);
	}
	void display(double a, double d) {
		System.out.println(a+d);
	}
	public static void main(String[] args) {
		
		OverRiding obj=new OverRiding();
		obj.display(3, 5);
		obj.display(5.5, 6.5);
	}

}
