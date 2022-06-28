package javaPackage;

public class UnaryOperator1 extends FirstJavaProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=10;
		System.out.println(a++);// 10,11
		System.out.println(a++ + ++a);//11,12 13,13  o/p=24
		System.out.println(b++ + ++b);//10,11 12,12 o/p=22
		System.out.println(b);//12
		System.out.println(a++ + b++);//13,14 22,23 o/p=25
		
		int x=2;
		int y=x++;
		System.out.println(y);//2,3
		System.out.println(x);//3
	}

}
