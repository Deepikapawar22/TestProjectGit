package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown6thWay {
	
	
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Deepika\\Testing\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);

		WebElement bm = driver.findElement(By.xpath("//*[@title='Month']"));
		Select month = new Select(bm);// select class parameterized constructor

		bm.sendKeys("Feb");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");

	}

}
