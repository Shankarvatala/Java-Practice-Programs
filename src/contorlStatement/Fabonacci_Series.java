package contorlStatement;

public class Fabonacci_Series {
	public static void main(String[] args) {
		int	n1=0,n2=1,n3,i,cunt=10;
		//System.out.println(n1+" "+n2);
		for( i=2;i<cunt;++i) {
		//for(i=cunt;i>2;--i) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}	
	}
}


