package javaPackage;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


public class ObjectRepository {

		// Create location of properties file
		public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\MFG\\eclipse-workspace\\javaselenium\\src\\Repository\\Object_Repo.properties");
		
		// Create FileInputStream file class object to load file
		FileInputStream fis = new FileInputStream(src);

		// Create properties class obeject to read properties file
		Properties pro = new Properties();
		pro.load(fis);
		
		// setting properties of chrome browser and passing chrome driver path
		System.setProperty("webdriver.chrome.driver", "F:\\Deepika\\Testing\\Software\\chromedriver\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro.getProperty("URL"));// Open URL
		
		//getProperty method accept key and return value for same key
		driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("EmailTestData"));
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("PasswordTestData"));
		Thread.sleep(3000);
		driver.quit();
	}

}
