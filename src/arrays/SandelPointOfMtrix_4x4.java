package arrays;

public class SandelPointOfMtrix_4x4 {

	public static void main(String[] args) {
		int[][]arr= {{1, 2, 3,   4},
		             {5, 6, 7,   8},
		             {9, 10,11,12},
		             {13,14,15,16}};
		for(int i=0;i<arr.length;i++) {
			int mci=0; //minimum coloum value 
		for(int j=0;j<arr.length;j++)	{
			//mci=j;
			if(arr[i][mci]>arr[i][j]) {
				mci=j;
			}
		}
		boolean flag=true;
		for(int k=0;k<arr.length;k++) {
			if(arr[i][mci]<arr[k][mci]) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("sandle point:"+arr[i][mci]);
		}
		}

	}

}
