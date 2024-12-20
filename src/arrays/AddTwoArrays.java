package arrays;

public class AddTwoArrays {

	public static void main(String[] args) {
		int[]a= {1,2,3};
		int[]b= {4,5,6};
		int[]c;
		System.out.println("length of the size is a:"+a.length);
		System.out.println("length of the size is a:"+b.length);
		c=new int[3];
		  for(int i=0;i<3;i++)	{
			
				c[i] =a[i]+b[i];
			  System.out.print(c[i]+" ");
		  }
		
       	}

}
