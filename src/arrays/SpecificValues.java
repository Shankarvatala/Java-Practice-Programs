  package arrays;

public class SpecificValues {

	public static boolean met(int target) {
		int[]arr= {1,2,3,4,5,6,};
		System.out.println("lemgth of array:"+arr.length);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {//checking in the condition are equal in target values
				return true;// condition is true enter the true
			}
		}
		return false;// condition is fall enter into false

	}
	public static void main(String[] args) {
		int target=5;
		boolean res=SpecificValues.met(target);//Accessing the methods values in boolean 
	if(res) {
		System.out.println("specific values is:"+target);
	}
	else {
		System.out.println("not specific values:"+target);
	}
		
	}

}
