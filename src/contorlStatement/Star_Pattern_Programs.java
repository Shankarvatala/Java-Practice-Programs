package contorlStatement;

public class Star_Pattern_Programs {
	public static void main(String[] args) {
		int row=5,num=5;
		
		for(int i=1;i<=row;i++) {
		//for(int i=5;i>=1;i--) {// revease of the pattern program
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();//moving the line 
		}
		
	}

}
