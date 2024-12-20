package thisKeyword;

public class DemoProgram {
	
	int num;
	DemoProgram(int num){//creat a constructors
		this.num=num;
	}
	void display() {
		System.out.println("shankar :"+num);
	}

	public static void main(String[] args) {
	DemoProgram obj=new DemoProgram(10);
	obj.display();

	}

}
