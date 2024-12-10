package arrays;

public class BasicArrayProgram {

	public static void main(String[] args) {
		int []array= {2,4,6,8,10};
		int sum=0;
		System.out.println("length of the array size is:"+array.length);
		for(int i=0;i<array.length;i++) {
			
		
		System.out.println(array[i]);
		sum+=array[i];
		}
		System.out.println("the sum of the values is:"+sum);
	}

}
