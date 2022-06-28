package CucumberPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {

public void openURL() {
	System.setProperty("webdriver.chrome.driver", "F:\\Deepika\\Testing\\Software\\chromedriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("")
	
	
	
}
}
