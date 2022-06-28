package javaPackage;

public class Continueloop2 {

	public static void main(String[] args) {
		// Outer Loop
		for(int i=1; i<=3;i++) {
			//inner Loop
			for(int j=1; j<=3; j++) {
				if(i==2 && j==2) {
					continue;
					
				}
				System.out.println(i+""+j);
			}
		}

	}

}
