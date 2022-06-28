package javaPackage;

public class MOL7 {
	
	public void sum (int a, long b) {
		
		System.out.println(a+b);
		
	}
	public void sum(long a, int b) {
		System.out.println(a+b);
	}
public static void main(String[] args) {
	MOL7 mol7 = new MOL7();
	mol7.sum(20,20);//Ambiguity issue
	
}
}
