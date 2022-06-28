package javaPackage;

public class Unaryoperator5 {

	public static void main(String[] args) {
	int a=10;
	int b=30;
	 System.out.println(a++ + ++b);//10,11 31,31 =41
	 System.out.println(b++ + ++a);//31,32 12,12=43
	 System.out.println(++b + ++a);//33,33 13,13=46
	 System.out.println(b);//33
	 System.out.println(++a + --b);//14,14 32,32=46

	 int x=2;
	 int y=x++;
			 System.out.println(y);//2
			 System.out.println(x);//3
	 
	}

}
