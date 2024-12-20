package abstractClass;

abstract class DemoProgram {
	abstract void display();

	void display1() {

	}
}

class DemoProgram1 extends DemoProgram {

	@Override
	void display() {
		// TODO Auto-generated method stub

	}
}

class abstractMain {
	public static void main(String[] args) {
		DemoProgram1 obj = new DemoProgram1();
		obj.display();
	}

}
