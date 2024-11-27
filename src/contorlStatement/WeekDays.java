package contorlStatement;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
		System.out.println("enter the day name");
		String name =obj.nextLine();
		if (name.equals("monday")) {
			System.out.println("monady");
		} else if (name.equals("tuesday")) {
			System.out.println("week day");
		} else if (name.equals("wensday")) {
			System.out.println("week day");
		} else if (name.equals("thursday")) {
			System.out.println("week day");
		} else if (name.equals( "fridayday")) {
			System.out.println("week day");
		} else if (name.equals("saturday")){
			System.out.println("it's weeknend");
		} else if (name.equals("sunday")) {
			System.out.println("it's weekend :");
		}

		else {
			System.out.println("invalid week ");
		}

	}

}
