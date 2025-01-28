package arrays;

public class Remove_Element_Arrays {

	public static void main(String[] args) {
		int[]arr= {1,2,3,5,6,7,8,9};
		int Remove=1;
		int Remove1=4;
		int[]arr1=new int[arr.length-2];
		for(int a:arr) {
			System.out.println(a+" ");
		}
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if((i+1)==Remove || (i+1)==Remove1){

				continue;
			}
			else {
				arr1[j++]=arr[i];

			}

		}
		//	System.out.println(arr1[3]=10);// re assinnig the values of index positions
		//System.out.println(arr1[1]=100);//re assinnig the values of index positions
		System.out.println("array after removing "+Remove+" :");
		for(int a1:arr1) {
			System.out.print(a1+" ");
			//System.out.println(a1[3]=10);
		}


	}

}
