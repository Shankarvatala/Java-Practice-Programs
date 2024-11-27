package constructor;

public class Paramized {
	//class MyClass {
	    // Fields
	    String input1;
	    int input2;

	    // Constructor with two parameters
	    Paramized(String input1, int input2) {
	        // Assign parameters to the fields
	        this.input1 = input1;
	        this.input2 = input2;
	    }

	    // Method to display the inputs
	    void display() {
	        System.out.println("Input1: " + input1);
	        System.out.println("Input2: " + input2);
	    }

	    public static void main(String[] args) {
	        // Create an object of MyClass and pass two inputs
	    	Paramized obj = new Paramized("Hello", 42);

	        // Call the display method to print the inputs
	        obj.display();
	    }
	}


		

	


