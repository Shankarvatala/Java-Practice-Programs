package strings;

import java.util.Scanner;

public class Split_Sentence {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = obj.nextLine();

		String[] words = sentence.split(" ");
		System.out.println("Words in the sentence:");
		for (String word : words) {
			System.out.println(word);
		}
	}
}





