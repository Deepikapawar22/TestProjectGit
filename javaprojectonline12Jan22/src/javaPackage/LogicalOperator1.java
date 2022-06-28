package javaPackage;

public class LogicalOperator1 {

	public static void main(String[] args) {
	
		int a=10;
		int b=5;
		int c=20;
		// Logical operator
		System.out.println(a<b && a<c);//
		System.out.println(a>b && a<b);//
		System.out.println(c<b && c<a);//
		System.out.println(a>b && a<c);//

		//Biwise operator
		System.out.println(a<b & a<c);//
		System.out.println(a>b & a<b);//
		System.out.println(c<b & c<a);//
		System.out.println(a>b & a<c);//
			}

}
