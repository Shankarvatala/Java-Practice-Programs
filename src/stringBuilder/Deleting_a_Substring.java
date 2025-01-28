package stringBuilder;

public class Deleting_a_Substring {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("Welocome to java programing");
         str.delete(11,15);
         System.out.println("After Deletion:"+str);
	}

}
