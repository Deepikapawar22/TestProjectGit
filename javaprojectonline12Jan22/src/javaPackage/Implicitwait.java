package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Implicitwait {

	public static void main(String[] args) throws InterruptedException {
		
	//Setting Property of chrome Browser and passing chromedriver path
	System.setProperty("webdriver.chrome.driver","F:\\Deepika\\Testing\\Software\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();//Launching Browsers Instance
	driver.manage().window().maximize();//Maximizing window
	
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("what is java d");
	
//Handling Auto suggesions
	
List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
System.out.println("Total Auto Selection :-" + AllSuggestions.size());
for (int i=0; i < AllSuggestions.size(); i++) {

String ExpectedResult = "what is java developer";

if (AllSuggestions.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
AllSuggestions.get(i).click();
System.out.println();
System.out.println(ExpectedResult + " Clicked ");
break;

	}
}
}
}