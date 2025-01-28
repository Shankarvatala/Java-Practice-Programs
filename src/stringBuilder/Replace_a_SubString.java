package stringBuilder;

public class Replace_a_SubString {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder(" good Morning");
		str.replace(5,12," evening ");
		System.out.println("After Replacement:"+str);
	}

}
