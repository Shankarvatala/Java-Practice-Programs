package contorlStatement;

public class Alaphabets_And_Numbers {

	public static void main(String[] args) {
		int i = 1, num = 26;


		for (i = 1; i <= num; i++) {

			char alaphabet = (char) ('A' + i - 1);
			System.out.println("number:"+i+":"+alaphabet); 
			//System.out.println(i );
			//System.out.println(alaphabet);


		}

	}
}
