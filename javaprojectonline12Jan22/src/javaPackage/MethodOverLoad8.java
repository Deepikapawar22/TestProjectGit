package javaPackage;

public class MethodOverLoad8 {
	
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	public void sum(long a, long b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MethodOverLoad8 mo8 = new MethodOverLoad8();
		mo8.sum(40,50);

	}

}
