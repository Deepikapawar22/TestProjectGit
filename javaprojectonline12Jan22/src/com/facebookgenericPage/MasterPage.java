package com.facebookgenericPage;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium;
import org.openqa.selenium.WebDriver;

public class MasterPage {
public static WebDriver driver;
public Properties prop;
public Properties or;
//implement constructor
public MasterPage() {
	//Configure properties file
	FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\facebook\\repository\\Configuration.properties");
	
	prop = new Properties();
	prop.load(ip);
	
	//Configure properties file
FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\facebook\\repository\\Locators.properties");
	
	or = new Properties();
	or.load(fs);
	if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",("user.dir"+"com.facebook.drivers\\chromedriver.exe"));
	driver= new ChromeDriver();
	}else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver",("user.dir"+"com.facebook.drivers\\geckodriver.exe"));
	}else {
		System.out.println("open IE browser");
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlywait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	
}
public void click(String xpathKey) {
	driver.findElement(By.xpath(or.getProperty(xpathKey))).click();
}
public void enterData(String xpathKey, String testData) {
	driver.findElement(By.xpath(or.getProperty(xpathKey))).sendKeys(or.getProperty(testData));
}
public void clearData(String xpathKey, String testData) {
	driver.findElement(By.xpath(or.getProperty(xpathKey)).clear();
	
}
public void moveToElement(String xpathKey, String moveToelement) {
	Actions act = new Actions(driver);
	act.moveToElemet(driver.findElement(By.xpath(or.getProperty(xpathKey)))).build().perform();
	}
public void clikListElement(String xpathKey, String testData) {
	List<WebElement> radios = driver.findElements(By.xpath(xpathKey));
	for(int i=0; i<radios.size(); i++) {
		if (radios.get(i).getText().equalsIgnoreCase(or.getProperty(testData)){
			radios.get(i).click();
			
		}
	}
	
}
}
