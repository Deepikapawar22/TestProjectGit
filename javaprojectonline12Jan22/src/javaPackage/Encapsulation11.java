package javaPackage;

public class Encapsulation11 {

	String name;
	int b;
	final int c = 2;

	public void setName(String a) {
		this.name = a;
		this.b = 5;
		System.out.println(b);
		System.out.println(c);
	}

	public Object getName() {
		return name;
	}
}
