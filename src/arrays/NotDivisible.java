package arrays;

public class NotDivisible {

	public static void main(String[] args) {
		int []array= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		System.out.println("the length of the array size:"+array.length);
		for(int i=1;i<array.length;i++) {
			//System.out.println(array[i]);
			//System.out.println("is not divisble for 3 and 5 factors");
			if((array[i]%3!=0) && (array[i]%5!=0 ))  {
				System.out.println(array[i]);
				sum+=array[i];
			}
			

	}
		System.out.println("the sum number is:"+sum);
	}
}
