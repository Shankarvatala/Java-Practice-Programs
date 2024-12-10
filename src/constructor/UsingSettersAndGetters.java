package constructor;

import java.util.Scanner;

public class UsingSettersAndGetters {
	private int Age;
	private String Name;

	public int getAge() {
	 return Age;
	}
	public void setAge(int Age) {
		this.Age=Age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public static void main(String[] args) {
		UsingSettersAndGetters obj=new UsingSettersAndGetters();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age ");
		int Age=sc.nextInt();
		obj.setAge(Age);
		System.out.println("enter the name");
		String Name=sc.next();
		obj.setName(Name);
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	}
}
