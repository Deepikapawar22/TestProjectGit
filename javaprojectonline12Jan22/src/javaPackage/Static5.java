package javaPackage;

public class Static5 {
	static int z = 5;
	int y = 1;

	// Static Method
	public static void a() {
		z = 10;
		System.out.println(z);
	}
	//Non static method
	public void b() {
		z = 15;
		System.out.println(z);
	}

	public static void main(String[] args) {
		a();
		Static5 s5 = new Static5();
		s5.b();
	}
}
