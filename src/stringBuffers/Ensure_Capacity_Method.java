package stringBuffers;

public class Ensure_Capacity_Method {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
        System.out.println("Default Capacity: " + sb.capacity());
        sb.ensureCapacity(60);
        System.out.println("After ensureCapacity(50): " + sb.capacity());	
	}

}
