package arrays;

public class Sorted_In_Array {

	public static void main(String[] args) {
		int[]arr= {5,2,66,73,38,19};
		System.out.println("original array:");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		int temp=0;
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
						
			}
		}
		System.out.print("\nsorting array:");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}

	}

}
