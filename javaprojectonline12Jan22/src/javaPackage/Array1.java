package javaPackage;

public class Array1 {

	public static void main(String[] args) {

		// Declaration of an array and instantiation
		int a[] = new int[5];

		// print default value of an array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		// Initialize an array
		a[0] = 90;
		a[1] = 33;
		a[2] = 76;
		a[4] = 54;
		a[3] = 77;
		System.out.println(a[2]);

		// Print the lengthof Array

		System.out.println("Total Length of an Array :-" + a.length);
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

	}

}
