package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RdioButton {

	public static void main(String[] args) throws InterruptedException {
		// Setting the property of chrome browser and passing chrome driver path
		System.setProperty("webdriver.chrome.driver", "F:\\Deepika\\Testing\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
			}

}
