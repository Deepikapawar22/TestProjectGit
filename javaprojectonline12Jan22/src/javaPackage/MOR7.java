package javaPackage;

public class MOR7 {
	public static void main(String[] args) {
		
		///Assign parent class ref to Child class object - Dynamic Method dispatch
		MOR5 mo5 = new MOR6();
		mo5.cook();// its in both parent and child class but child class will shown
		//mo5.angry();// its present in parent class so it will not shown
		mo5.eat();
	}

}
