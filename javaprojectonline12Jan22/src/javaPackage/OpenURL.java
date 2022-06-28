package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenURL {

	public static void main(String[] args) throws InterruptedException  {
		
		//Setting the property of chrome browser and passing chrome Driver path
		System.setProperty("webdriver.chrome.driver", "F:\\Deepika\\Testing\\Software\\chromedriver.exe");
		
		//Launching Chrome browser Instance
		WebDriver driver =   new ChromeDriver();

		//manage()method
		driver.manage().window().maximize();
		
		//Open application using get() and navigate() method
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.co.in/");
		
		//Refresh the page
		Thread.sleep(3000);
		driver.navigate().back();
		
		//Navigate to forword
		Thread.sleep(3000);
		driver.navigate().forward();
		
		//Navigate to back
		Thread.sleep(3000);
		driver.navigate().back();
		
		//Fetch Current URL
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		// Get Title of web page
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		//Close the current browser instance
		Thread.sleep(3000);
		driver.close();
		
		//close all browser instance
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
