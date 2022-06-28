package javaPackage;

public class AbstractClass2 extends AbstractClass1 {
	void eat() {
		System.out.println("eating");

	}

	public static void main(String[] args) {
		// We can not create an object of abstract class and interface
		AbstractClass2 ac2 = new AbstractClass2();
		ac2.eat();
		ac2.a();

	}

}
