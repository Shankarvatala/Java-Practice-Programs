package strings;

public class SubSequenceOfAnotherString {
	
	    public static void main(String[] args) {
	        String str1 = "abc";
	        String str2 = "aebdc";
	        int i = 0;

	        for (char ch : str2.toCharArray()) {
	            if (i < str1.length() && ch == str1.charAt(i)) {
	                i++;
	            }
	        }

	        if (i == str1.length()) {
	            System.out.println("String 1 is a subsequence of String 2.");
	        } else {
	            System.out.println("String 1 is not a subsequence of String 2.");
	        }
	    }
	}


 
