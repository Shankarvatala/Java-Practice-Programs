package stringBuffers;

public class Delete_Method {

	public static void main(String[] args) {
    StringBuffer str=new StringBuffer("hello world");
    str.delete(5, 11);
    System.out.println("After Delete:"+str);

	}

}
