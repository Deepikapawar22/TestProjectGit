package javaPackage;

public class Method {
//main methos - main function. double slash is used to write comment line
	//shortcut for main metho - type ma in class body and press ctrl+space
	public static void main(String[] args) {
		// Shortcut to write System.out.println() :- write syso inside method body and 
		//press ctrl+space
		System.out.println("hello selenium");// printing the string
		System.out.println("Advika");
		System.out.println("Avadhut");
		System.out.println("Deepika");
		System.out.println("Ashish");
		System.out.println("Ambekar");
		aMethod();
		bMethod();
	}
	//User defined static methos
	public static void aMethod() {
		System.out.println("aMethod");
	}
	public static void bMethod() {
		System.out.println("bMethod");
	}
	}

