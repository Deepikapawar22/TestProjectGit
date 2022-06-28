package javaPackage;

public class Inheritance14 extends Inheritance13{
	
	public void multiply(int x, int y) {
		
		z=x*y;
		System.out.println("Multiplication is" +z);
	}

	public static void main(String[] args) {
		int x= 10;
		int y=5;
		
		Inheritance14 i4 = new Inheritance14();
		i4.add(x, y);
		i4.substract(16, 3);
		i4.substract(x, y);
		i4.multiply(x, y);
		i4.multiply(7, 2);
		i4.add(80, 9);
		

	}

}
