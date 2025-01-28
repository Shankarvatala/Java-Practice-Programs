package strings;

public class Remove_Duplicate_Element {

	public static void main(String[] args) {
		
		        String str = "jaavaa iiss love you ";
		        StringBuilder result = new StringBuilder();

		        for (char ch : str.toCharArray()) {
		            if (result.indexOf(String.valueOf(ch)) == -1) {
		                result.append(ch);
		            }
		        }

		        System.out.println("String without duplicates: " + result.toString());
		    }
		}


	


