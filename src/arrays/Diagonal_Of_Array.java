package arrays;

public class Diagonal_Of_Array {

	public static void main(String[] args) {
	 int[][]matrix= {{1,2,3},
			         {4,5,6},
			         {7,8,9}};
	 
			 
	int n=matrix.length;	
	int[]diagonal=new int[n] ;
	for(int i=0;i<n;i++) {
		diagonal[i]=matrix[i][i];
		diagonal[i] = matrix[i][n - 1 - i];//(2nd diagonal)
		//diagonal[i] = matrix[i + 1][i];  (3rd diagonal)
	}
	System.out.println("Diagonal elements");
		for(int res:diagonal) {
			System.out.print(res);
		}
	 

	}

}
