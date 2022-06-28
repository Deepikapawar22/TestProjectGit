package javaPackage;

public class EH1 {

	public static void main(String[] args) {
		try {
			int a = 5 / 0;
		} catch (ArithmeticException a) {
			a.printStackTrace();
			System.out.println(a);
		} catch (NullPointerException n) {
			n.printStackTrace();
			System.out.println(n);
		} catch (ArrayIndexOutOfBoundsException c) {
			c.printStackTrace();
			System.out.println(c);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exception Hnadled");
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally will execute always");
		}
	}

}
