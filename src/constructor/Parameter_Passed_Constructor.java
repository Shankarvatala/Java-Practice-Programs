package constructor;

public class Parameter_Passed_Constructor {

	
	  String name;
	  int rollno;
	  Parameter_Passed_Constructor(){
		  name="shankar";
		  rollno=81;
	  }
		  Parameter_Passed_Constructor(String a,int no ){	  
	  	   name=a;
	  	   rollno=no;
		  
		  } 
		  public static void main(String[] args) {
			  Parameter_Passed_Constructor obj=new  Parameter_Passed_Constructor();
			  Parameter_Passed_Constructor aobj=new  Parameter_Passed_Constructor("teja",82);
		      System.out.println(obj.name);
		      System.out.println(obj.rollno);
		      System.out.println(aobj.name);
		      System.out.println(aobj.rollno);
	  }

	}

