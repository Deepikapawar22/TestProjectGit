package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\\\Deepika\\\\Testing\\\\Software\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();// delete all cookies
		driver.get("https://www.facebook.com/");

		// Introduce JavaScriptExecutor - It is Interface and cast Interface
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Locate WebElement using JavascriptExecutor
		jse.executeAsyncScript("document.getElementById('email').value ='abc@gmail.com'");
		jse.executeAsyncScript("documnet.getElementById('pass').value ='1234'");

		// Scrolling down
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0, 400)");

		// Scroll up
		//Thread.sleep(3000);
		//jse.executeScript("window.scrollBy(0, -400)");
	}

}
