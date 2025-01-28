package stringBuffers;

public class Capacity_Method {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Initial Capacity: " + sb.capacity());
        sb.append(" World! This is a test for capacity.");
        System.out.println("Capacity after append: " + sb.capacity());
    }

	}


