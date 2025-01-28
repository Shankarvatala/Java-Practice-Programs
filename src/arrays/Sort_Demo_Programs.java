package arrays;

import java.util.Arrays;

public class Sort_Demo_Programs {

	public static void main(String[] args) {
		int[]num= {1,5,9,7,8,4,2};
		char[]cha= {'a','b','c','z','e','d'};
		Arrays.sort(num);
		Arrays.sort(cha);
		System.out.println();
		for(int i:num) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(char j:cha) {
			System.out.print(j+" ");
		}
		System.out.println();

	}		

}