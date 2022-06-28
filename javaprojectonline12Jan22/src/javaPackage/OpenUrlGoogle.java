package javaPackage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
public class OpenUrlGoogle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "F:\\Deepika\\Testing\\Software\\FirefoxDriver\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        Thread.sleep(5000);
	}

}