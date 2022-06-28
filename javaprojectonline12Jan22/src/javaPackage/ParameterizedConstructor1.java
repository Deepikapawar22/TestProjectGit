package javaPackage;

public class ParameterizedConstructor1 {
	
	int id;
	String name;
	String address;
	// Default constructor
	ParameterizedConstructor1() {
		System.out.println("Parameterized Constructor");
	}
	//Parameterized Constructor
	ParameterizedConstructor1(int a, String b, String c) {
		id = a;
		name = b;
		address = c;
	}
	// non Static Method
	public void displayInfo() {
		System.out.println(id + " " + name + " " + address);
	}
	public static void main(String[] args) {
		// Default Constructor calling
		ParameterizedConstructor1 pc = new ParameterizedConstructor1();
		//ParameterizedConstructor calling
		ParameterizedConstructor1 pc1 = new ParameterizedConstructor1(1, "Ram", "Pune");
		ParameterizedConstructor1 pc2 = new ParameterizedConstructor1(1, "John", "pune");
		pc1.displayInfo();
		pc2.displayInfo();
	}

}
