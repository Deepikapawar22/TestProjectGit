package javaPackage;

public class Globalvariable {
	
	int a = 5;// Global variable
		
		static int c = 10;// static variable
	
	public static void main(String[] args) {
		System.out.println("Hello selenium");
		System.out.println("12345");
		System.out.println("Deepika");
		System.out.println("Advika");
		aMethod();
		bMethod();
	}
//user defined static method
	public static void aMethod() {
		System.out.println("Hi A Method");
	}

//User defined Static method
public static void bMethod() {
	
	System.out.println("Hi B Method");
	
	int b = 4;// Local variable
}

}
