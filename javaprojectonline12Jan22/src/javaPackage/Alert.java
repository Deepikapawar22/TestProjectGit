package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"F:\\\\Deepika\\\\Testing\\\\Software\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		//Verify Alert text
		System.out.println(driver.switchTo().alert().getText());
		String ExpectedResult = "Do you confirn Action:";
		Assert.assertEquals(driver.switchTo().alert().getText(), ExpectedResult);
		
		//AcceptTheAlert
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Accept worked");
		//Dismiss the Alert
		driver.findElement(By.id("confirmationButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("Dismissed worked");
		

	}

}
