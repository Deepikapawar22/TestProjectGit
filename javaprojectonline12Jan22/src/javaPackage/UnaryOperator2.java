package javaPackage;

public class UnaryOperator2 extends FirstJavaProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println(a++);//10,11
		
		System.out.println(a++ + ++a);// 11,12 13,13
		
		System.out.println(a + a++);// 13 13,14
		
		System.out.println(b++ + b--);//20, 21 21,20
		
		System.out.println(b);//20
		
		

	}

}
