package javaPackage;

public class IfElse4 {

	public static void main(String[] args) {
		int age=15;
		int weight = 50;
		
		if (age>18) {
			
			if(weight  > 50) {
				System.out.println("Eligible for blood donation");
			}else {
				System.out.println("not eligible");
			}
		}else {
			System.out.println("age nust be greater than 18");
		}

	}

}
