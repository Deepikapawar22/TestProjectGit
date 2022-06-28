package javaPackage;

public class PrePostincrement {

	public static void main(String[] args) {
		int i=1;
		System.out.println(i++);
		System.out.println(i);
		
		int x=2;
		int y=x++;
		System.out.println("y is " +y);
		System.out.println("x is" +x);
		
		int z=9;
		System.out.println(++z);
		
		int u=8;
		int p=++u;
		System.out.println("p is " +p);
		System.out.println("u is " +u);

	}

}
