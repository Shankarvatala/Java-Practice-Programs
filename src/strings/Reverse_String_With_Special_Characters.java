package strings;

public class Reverse_String_With_Special_Characters {

	public static void main(String[] args) {
		String Str1="abc/defgh$ij";
		String Str2=reverseStringPreserveSpecialChars(Str1);
System.out.println("Str1:"+Str1);
System.out.println("Str2:"+Str2);
	}
	public static String reverseStringPreserveSpecialChars(String str) {
	char[]arr=str.toCharArray();
	int left=0;
	int right=arr.length-1;
	while(left<right) {
		if(!Character.isLetterOrDigit(arr[left])) {
			left++;
		}
		else if(!Character.isLetterOrDigit(arr[right])){
			right--;
		}
		else {
			char temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right++;
		}
	}
	
		return new String(arr);
		
	}	
	}

