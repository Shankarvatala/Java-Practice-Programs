package thisKeyword;

public class This_Using_Methods {
	void display() {
		show();//this are using calling the show method
		System.out.println("81");
	}
	static void show() {
		//This_Using_Methods obj1=new This_Using_Methods();
	//obj1.display();
	System.out.println("bhavani");	
	
	}

	public static void main(String[] args) {
		This_Using_Methods obj=new This_Using_Methods();
		//This_Using_Methods.show();
         obj.display();
	}

}
