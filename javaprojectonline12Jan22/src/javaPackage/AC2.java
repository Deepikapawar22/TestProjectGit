package javaPackage;

import cucumber.api.cli.Main;

public class AC2 extends AC1{
void eat() {
	System.out.println("I am eating");
}
public static void main(String[] args) {
	//AC1 ac1 = new AC1();// we can not create object of abstract class and interface
	AC2 ac2 = new AC2();
	ac2.eat();
	ac2.a();
}
}
