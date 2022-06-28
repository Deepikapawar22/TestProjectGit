package javaPackage;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Log4J {

	public static void main(String[] args) {
		//We need to create logger Instance so we need to pass class name
		//for which we need to create log file
		Logger logger = Logger.getLogger("log4j");
		
		//Configure log4j.properties file
		PropertyConfigurator.configure("C:\\Users\\MFG\\eclipse-workspace\\javaselenium\\log4j.properties");
		
		//open Chrome Browser Instance
		System.setProperty("webdriver.chrome.driver","F:\\Deepika\\Testing\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("Chrome browser Instance opened");
		
		//Maximise screen
		driver.manage().window().maximize();
		logger.info("Maximize screen");
		
		//set implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Implicit Wait given");
		
		//open Url
		driver.get("http://facebook.com/");
		logger.info("URL Open");
		

	}

}
