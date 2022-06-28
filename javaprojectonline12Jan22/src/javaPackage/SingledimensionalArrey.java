package javaPackage;

public class SingledimensionalArrey {

	public static void main(String[] args) {
		int[]a=new int[5];//Declaration and instantiation
		a[0]=5;
		a[1]=6;
		a[2]=7;
		a[3]=8;
		a[4]=9;//or we can write a[]={5,6,7,8,9}
		System.out.println("Lenghth of arrey is" +a.length);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	
	}

}
