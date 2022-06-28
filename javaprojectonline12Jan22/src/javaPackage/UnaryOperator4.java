package javaPackage;

public class UnaryOperator4 {

	public static void main(String[] args) {
	
		int a = 10;
		
		int b = 20;
		
		System.out.println(a++ + ++a);//10,11 12,12 =22
		
		System.out.println(--b + b++);//19,20 19,20 = 38
		
		System.out.println(b++ + b--);//20,21 21,20 = 41
		
		System.out.println(b);//20

		System.out.println(a);//12
	}

}
