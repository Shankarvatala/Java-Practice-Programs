package Operators;

public class OR_Operator {

	public static void main(String[] args) {
		int team=3,team1=4,team2=8;
		boolean teams=(team>team2||team1<team2);
		System.out.println(teams);
		 
		
		boolean sum=!(team1<team);
		boolean res=(team2>team^team<team2);
		System.out.println(sum);
		System.out.println(res);
	}

}
