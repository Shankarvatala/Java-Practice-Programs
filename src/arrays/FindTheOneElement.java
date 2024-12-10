package arrays;

public class FindTheOneElement {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 5, 6, 7 };
		System.out.println("length of array is:" + array.length);
		for (int i = array.length - 5; i >= 1; i--) {
			System.out.println(array[i]);
		}

	}

}
