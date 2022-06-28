package javaPackage;

public abstract class AbstractClass1 {

	static int a = 5;// Static variable
	int b = 5;//Global Variable
	final int c = 20;//Final Variable

	// Default Constructor
	AbstractClass1() {
		System.out.println("Hello Abstract Class");
	}

	// Abstract Method
	abstract void eat();

	// non abstract method
	public void a() {
		System.out.println("Non Abstract Method");

	}

}
