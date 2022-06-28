package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURlFB {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Deepika\\Testing\\Software\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	 driver.manage().window().maximize();
		
	 Thread.sleep(3000);
	 driver.get("https://www.facebook.com/");
	 
	 driver.navigate().to("https://www.google.com/");
		
	 Thread.sleep(3000);
	 driver.navigate().refresh();
	 
	 Thread.sleep(3000);
	driver.navigate().back();
	 
	 Thread.sleep(3000);
	 String CurrentUrl = driver.getCurrentUrl();
	 System.out.println(CurrentUrl);
	 
	 Thread.sleep(2000);
	 System.out.println(driver.getTitle());
	 
	 Thread.sleep(3000);
	 driver.close();
	 
	 Thread.sleep(3000);
	 driver.quit();
	}

}
