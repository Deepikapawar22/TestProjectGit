package javaPackage;

public class EH10 {

	public static void checkEligibility(int age) {
		try{
			if (age<18) {
			throw new ArithmeticException("Not eligible for voting");
		}else {
			System.out.println("Eligibel");
		}
	}catch(

	Exception e)
	{
		e.printStackTrace();
	}
}

	public void main(String[] args) throws InterruptedException, Exception, ArithmeticException {
		Thread.sleep(3000);
		checkEligibility(15);
		checkEligibility(91);
	}
}
