package javaPackage;

public class EH8 {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("It will executes Always");
	}

}
