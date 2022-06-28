package javaPackage;

public class Static3 {

	int roll;
	String Selenium;
	static String college = "SVIT";

	Static3(int r, String n) {
		roll = r;
		Selenium = n;

	}
	public void getResult() {
		System.out.println(roll + "" + Selenium + "" + college);

	}

}
