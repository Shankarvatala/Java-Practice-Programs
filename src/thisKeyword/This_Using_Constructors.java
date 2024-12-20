package thisKeyword;

public class This_Using_Constructors {
	This_Using_Constructors(){
		//default constructors
	System.out.println("java");	
	}
	This_Using_Constructors(int a){
		//paramized constrctors
		 this();//calling a noa paramized constructors
		System.out.println(a);
	}

	public static void main(String[] args) {
		This_Using_Constructors obj=new This_Using_Constructors(10);

	}

}
