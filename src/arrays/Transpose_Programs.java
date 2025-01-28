package arrays;
import java.util.Scanner;
public class Transpose_Programs {
	
	
	    public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
      System.out.println("entre the rows ");
      int rows=obj.nextInt();
      System.out.println("enter the col");
      int col=obj.nextInt();
      
      int[][]matrix=new int [rows][col];
         
      for(int i=0;i<rows;i++) {
    	  for(int j=0;j<col;j++) {
    		matrix[i][j]=obj.nextInt();  
    	  }
    	 
      }
      for(int i=0;i<rows;i++) {
    	  for(int j=0;j<col;j++) {
      		 System.out.print(matrix[i][j]+" ");  
      	  }
    	  System.out.println();
      	  
 	 }
      //transpose 
      int [][]transpose=new int[col][rows];
       for(int i=0;i<rows;i++) {
    	   for(int j=0;j<col;j++) {
    		   transpose[j][i]=matrix[i][j];
    	   }
       }
       System.out.println("transpose the array");
       for(int i=0;i<col;i++) {
    	   for(int j=0;j<rows;j++) {
    		   System.out.print(transpose[i][j]+" ");
    	   }
    	   System.out.println();
       }
       
	       
	    }
	}



