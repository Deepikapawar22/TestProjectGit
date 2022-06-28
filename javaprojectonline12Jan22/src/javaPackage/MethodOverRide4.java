package javaPackage;

public class MethodOverRide4 extends MethodOverRide3{
	
	public void run() {
		System.out.println("Ram is running");
	}

	public static void main(String[] args) {
		MethodOverRide4 mr4 = new MethodOverRide4();
		mr4.run();
		MethodOverRide3 mr3 = new MethodOverRide3();
		mr3.run();

	}

}
