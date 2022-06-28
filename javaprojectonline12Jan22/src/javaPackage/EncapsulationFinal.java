package javaPackage;

public class EncapsulationFinal {

	String name;
	int b;
	final int c = 2;

	public void setName(String a) {
		this.name = a;
		this.b = 5;
		System.out.println(a);
		System.out.println(b);
	}

	public Object getName() {
		return name;
	}

}
