package arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		  int[]array= {10,2,60,50};
		  int smallest=array[0];
		  for(int i=1;i<array.length;i++) {
			  if(smallest>array[i]) {
				  smallest=array[i];  
			  }
			  
		  }
		  System.out.println(smallest);

	}

}
