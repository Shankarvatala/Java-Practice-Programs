package arrays;

public class SandleOfPointOfMatrix {
	

	public static void main(String[] args) {
		int[][]a = {{1,2,3},{5,6,0},{8,9,2}};
		for(int i=0;i<a.length;i++) {
			int mci=0;   //minimum coloum index values
		for(int j=0;j<a.length;j++)	{
			if(a[i][mci]>a[i][j]) {
				mci=j;
			}
		}
		boolean flag= true;
		for(int k=0;k<a.length;k++) {
			if(a[i][mci]<a[k][mci]) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("sandle point:"+a[i][mci]);
		}
			
		}

	}

}
