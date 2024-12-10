package constructor;

import java.util.Scanner;

public class Bank3 {//   Dokra  group program
	private String BankName;
	private String DokraGroupName;
	private int GroupMembers;

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		this.BankName = bankName;
	}

	public String getDokraGroupName() {
		return DokraGroupName;
	}

	public void setDokraGroupName(String dokraGroupName) {
		this.DokraGroupName = dokraGroupName;
	}

	public int getGroupMembers() {
		return GroupMembers;
	}

	public void setGroupMembers(int groupMembers) {
		this.GroupMembers = groupMembers;
	}

	public void method() {
		Bank3 obj = new Bank3();

		Scanner sc = new Scanner(System.in);// taking in user

		// set the fields from to users
		System.out.println("enter the bank name");
		String BankName = sc.nextLine();
		obj.setBankName(BankName);
		System.out.println("enter the dokra group name");
		String DokraGroupName = sc.nextLine();
		obj.setDokraGroupName(DokraGroupName);
		System.out.println("how many members");
		int GroupMembers = sc.nextInt();
		obj.setGroupMembers(GroupMembers);

		// get the fields from to users
		System.out.println("BankName:" + obj.getBankName());
		System.out.println("DokraGroupName:" + obj.getDokraGroupName());
		System.out.println("GroupMembers:" + obj.getGroupMembers());

		// looping for the how many group members
		// group members details
		for (int i = 1; i <= GroupMembers; i++) {
			System.out.println("enter account holder number");
			long AccountHolderNumber = sc.nextLong();
			System.out.println("enter the account holder name");
			String AccoutHolderName = sc.next();
			System.out.println("enter the age ");
			short Age = sc.nextShort();
			System.out.println("Balance");
			double Balance = sc.nextDouble();

			System.out.println("AccountHolderNumber:" + AccountHolderNumber);
			System.out.println("AccoutHolderName:" + AccoutHolderName);
			System.out.println("age:" + Age);
			System.out.println("Blance:" + Balance);


		}

	}

	public static void main(String[] args) {
		Bank3 obj1 = new Bank3();

		obj1.method();
	}

}
