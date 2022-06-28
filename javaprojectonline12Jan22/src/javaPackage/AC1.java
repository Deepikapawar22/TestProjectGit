package javaPackage;

public abstract class AC1 {
 
	static int a=5;
	int b= 5;
	final int c=10;
	//Default Constructor
	AC1(){
		System.out.println("Hello Abstract class");
	}
	//Abstract Method - Dont have body
	abstract void eat();

	//non abstract method
	public void a() {
		System.out.println("Hello non abstract method");
	}

}