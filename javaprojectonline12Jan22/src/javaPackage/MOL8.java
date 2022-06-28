package javaPackage;

public class MOL8 {
public void sum (long a, long b) {
		
		System.out.println(a+b);
		
	}
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
public static void main(String[] args) {
	MOL8 mol8 = new MOL8();
	mol8.sum(20,20);//Ambiguity issue resolved

}
}