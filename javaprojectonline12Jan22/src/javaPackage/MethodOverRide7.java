package javaPackage;

public class MethodOverRide7 {

	public static void main(String[] args) {
		// Assigning parent class reference to child class object
		// Dynamic method dispatch
		MethodOverRide5 mr5 = new MethodOverRide6();
		mr5.cook();
		mr5.eat();
		// mr5.angry();
	}

}
