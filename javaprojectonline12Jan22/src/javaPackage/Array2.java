package javaPackage;

public class Array2 {

	public static void main(String[] args) {
		// we can write an Array below fasion as well
		Object a[] = { 1, 2, 3, 4, 5, "Selenium", 7, 9.1 };// Defining an object Array
		int b[] = { 22, 33, 11, 44, 55 };
		String s[] = { "Hello", "Deepika" };

		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(s.length);
		System.out.println(a[7]);
		System.out.println(b[4]);
		System.out.println(s[1]);

		a[5] = "Automation";
		System.out.println(a[5]);

	}

}
