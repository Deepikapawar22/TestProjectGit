package javaPackage;

public class Static6 {

	int x = 10;// Global variable
	static int y = 50;// Local variable

	public void a() {
		int z = 10;
		System.out.println(z);
	}

	static int b = 100;

	public static void b() {
		int a = 89;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Static6 s6 = new Static6();
		s6.a();
		System.out.println(s6.b);
		System.out.println(Static6.b);
		System.out.println(b);

	}

}
