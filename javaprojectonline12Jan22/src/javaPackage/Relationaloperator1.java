	package javaPackage;
	
	public class Relationaloperator1 {
	
		public static void main(String[] args) {
		int a=300;
		int b=300;
		
		if (a!=b) {
			System.out.println("a is not eqaual to b");
		} else {
			
			System.out.println("a is equal to b");
		}
		 			String p = " Hello SElenium";
				 String q = "Hello Selenium";
	// String comparison- 1st way is not correct
				 //we use == for number comparison- case sensitive
				 if (p==q) {
					 System.out.println("p is equal to q for 1st way");
		} else{
			System.out.println("p is not equal to q for 2nd way");
		}
	// String comparison  2nd way is not appropriate - case sensitive
				 if(p.equals (q)) {
					 System.out.println("p and q are equal for 2nd way");
				 }else {
					 System.out.println("p and q are not equal for 2nd way");
				 }
				 //String comparisom-3rd way is correct- not case sensitive
				 if (p.equalsIgnoreCase(q)) {
					 System.out.println("p and q are equal for 3rd way"); 
				 }else {
					 System.out.println("p and q are not equal for 3rd way");
				 }
	}
	}