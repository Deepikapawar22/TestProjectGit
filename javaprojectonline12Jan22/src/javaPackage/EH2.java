package javaPackage;

public class EH2 {

	public static void main(String[] args) {
		try {
			int c = 3 / 0;
		} catch (ArithmeticException a) {
			// TODO Auto-generated catch block
			a.printStackTrace();
			System.out.println(a);
		}
		System.out.println("Exception Handled");

	}

}
