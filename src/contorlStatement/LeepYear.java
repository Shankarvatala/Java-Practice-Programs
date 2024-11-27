package contorlStatement;

public class LeepYear {

	public static void main(String[] args) {
		int year=2022;
		if(year%4==0) {
			System.out.println("leepYar");
		}
		else if(year%100==0) {
			System.out.println("leepyear");
		}
		else if(year%400==0) {
			System.out.println("leepYear");
		}
		else {
			System.out.println("not a leep year");
		}

	}

}
