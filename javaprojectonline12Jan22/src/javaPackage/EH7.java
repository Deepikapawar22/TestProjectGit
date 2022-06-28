package javaPackage;

public class EH7 {

	public static void main(String[] args) {
		int a[] = new int[5];
		try {
			a[5] = 50 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exception Handled");
	}

}
