package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitP {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Deepika\\Testing\\Software\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.findElements(By.xpath("//input[@name='q']"));
	//Explicit wait
	WebDriverWait wt = new WebDriverWait(driver, 30);
	wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("WrongPass"))).sendKeys("12345");
		//Fluentwait
	FluentWait ws = new FluentWait(driver).withTimeUnit(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS);
	

	}

}
