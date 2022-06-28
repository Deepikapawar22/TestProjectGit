package javaPackage;
import java.util.Scanner;

public class Number_Triangle {

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		num = in.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 1; j++) {
				System.out.println("" + i + "");
			}
			System.out.println("\n");
		}
	}

}
