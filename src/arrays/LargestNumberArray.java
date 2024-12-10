package arrays;

public class LargestNumberArray {

	public static void main(String[] args) {
		int[]array= {10,50,700,999,999};
		int largest=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>largest) {
			largest=array[i];
		}
		}
		System.out.println("the largest number is :"+largest);
	}

}
