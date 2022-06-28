package javaPackage;

public class EqualsTest {

	public static void main(String[] args) {
		
		String s1= "abc";
		String s2 = s1;
		String s5 ="abc";
		String s3 = new String ("abc");
		String s4 = new String ("abc");
			System.out.println("==comparision:"+(s1==s5));//true
			System.out.println("==Comparision:"+(s1==s2));//true
			System.out.println("USing equals Method:"+s1.equals(s2));//True
			System.out.println("==Comparision:"+s3==s4);//False
			System.out.println("USing Equals Method:"+s3.equals(s4));//True
			
		

	}

}
