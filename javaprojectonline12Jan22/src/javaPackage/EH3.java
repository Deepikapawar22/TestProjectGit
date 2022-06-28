package javaPackage;

public class EH3 {

	public static void main(String[] args) {
		try {
			int c=10/0;
		} catch (ArithmeticException a) {
			a.printStackTrace();
		}
		catch (NullPointerException n) {
			n.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException b){
			b.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exception Handled");
		

	}

}
