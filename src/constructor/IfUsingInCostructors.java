package constructor;

public class IfUsingInCostructors {

	public class Person {
	    private String name;
	    private int age;

	    // Constructor with control statement
	    public Person(String name, int age) {
	        this.name = name;
	        
	        // Using control statements to validate and set age
	        if (age > 0 && age <= 120) {
	            this.age = age;
	        } else {
	            System.out.println("Invalid age provided. Setting age to default value of 0.");
	            this.age = 0;
	        }
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    public static void main(String[] args) {
	    	IfUsingInCostructors person1 = new IfUsingInCostructors("Alice", 25);
	        person1.displayInfo();

	        IfUsingInCostructors person2 = new IfUsingInCostructors("Bob", -5); // Invalid age
	        person2.displayInfo();
	    }
	}

	public IfUsingInCostructors(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}

}
