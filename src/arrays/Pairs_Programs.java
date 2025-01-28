package arrays;

public class Pairs_Programs {

	
	    public static void main(String[] args) {
	    	int[]arr= {1,5,7,9,11,6};
	    	int target=12;
	    	System.out.println("pairs with target values is:"+target);
	    	for(int i=0;i<arr.length;i++) {
	    		for(int j=i+1;j<arr.length;j++) {
	    			for(int k=j+1;k<arr.length;k++) {
	    				
	    			
	    			if(arr[i]+arr[j]+arr[k]==target) {
	    		
	    				System.out.println("( "+arr[i]+","+arr[j]+","+arr[k]+")");
	    				
	    			}
	    		}
	    	}
	    	} 

      }
	    }