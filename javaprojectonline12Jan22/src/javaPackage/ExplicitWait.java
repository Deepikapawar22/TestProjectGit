package javaPackage;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWait {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver","F:\\Deepika\\Testing\\Software\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		// add user name and password
		
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		WebDriverWait wt = new WebDriverWait(driver, 30);
		
		//Explicit wait condition to check used password is correct
		wt.until((ExpectedConditions.visibilityOfElementLocated(By.id("wrongpass")))).sendKeys("12345");
				
		
		
	}

}
