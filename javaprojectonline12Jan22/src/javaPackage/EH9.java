package javaPackage;

public class EH9 {

	public static void main(String[] args) {

		try {
			int i = 20 / 2;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				int i = 10 / 0;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finally block exception handled");
		}

	}
}