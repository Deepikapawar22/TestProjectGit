package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\\\Deepika\\\\Testing\\\\Software\\\\chromedriver\\\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");//Open URL
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();// click to Sign In
		Thread.sleep(3000);
		
		//Find out total number of frame presents on page
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(allFrames);
		
		//Go inside frame and check webelements
		for(int i=0; i<allFrames; i++) {
		driver.switchTo().frame(i);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();
		
		}

	}

}
