package javaPackage;

public class Inheritance4 extends Inheritance3 {

	public void multiply(int x, int y) {
		z = x * y;
		System.out.println("Multiplication :- " + z);

	}

	public void divide(int x, int y) {
		z = x / y;
		System.out.println("Dividation is :- " + z);
	}

	public static void main(String[] args) {
		int x = 30, y = 10;

		Inheritance4 i4 = new Inheritance4();
		i4.add(x, y);
		i4.substraction(x, y);
		i4.multiply(x, y);
		i4.divide(x, y);

	}

}
