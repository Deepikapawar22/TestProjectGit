package javaPackage;

public class IF5 extends IF1 implements IF3, IF4{

	@Override
	public void b() {System.out.println("b method");
	}

	@Override
	public void a() {
	System.out.println("a method");
		
	}
	public static void main(String[] args) {
		if5.a();
		if5.b();
		System.out.println(if5.roll);
		
	}

}
