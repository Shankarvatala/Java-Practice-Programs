package stringBuilder;

public class Checking_Capacity {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder();
		System.out.println("Inital Capacity :"+str.capacity());
		str.append("java");
		System.out.println("After Appending 'java':"+str.capacity());
		str.ensureCapacity(50);
		System.out.println("After Ensuring Capacity:"+str.capacity());
	}

}
