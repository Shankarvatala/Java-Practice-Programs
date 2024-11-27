package constructor;

public class Default_Constructor {
	int number;
	String name;
	public Default_Constructor() {
		number=100;
		name ="shankar";
	}

	public static void main(String[] args) {
		Default_Constructor obj=new Default_Constructor();
		System.out.println("number:" +obj. number);
		System.out.println("name:"+obj.name);

	}

}
