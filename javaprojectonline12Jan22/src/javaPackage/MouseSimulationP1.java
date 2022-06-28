package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseSimulationP1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\\\Deepika\\\\Testing\\\\Software\\\\chromedriver\\\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(3000);
		
		//create web element reference
		WebElement Electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		//Mouse simulation using Actions class
		Actions act = new Actions(driver);
		
		//Mouse hover to electronics Webelements
		Thread.sleep(3000);
		act.moveToElement(Electronics).build().perform();
		
		//Right Click
		Thread.sleep(3000);
		act.contextClick(Electronics).build().perform();
		
		//Release control from WebElement
		Thread.sleep(3000);
		act.release(Electronics).build().perform();
		
		//Perform Key Events
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		//press enter key to home element
		driver.navigate().refresh();
		
		WebElement Home = driver.findElement(By.xpath("//*[text()='Home']"));
		Thread.sleep(3000);
		act.sendKeys(Home, Keys.ENTER).build().perform();
		Thread.sleep(3000);
		System.out.println("Home Menu Clicked");
		act.sendKeys(Home, Keys.ENTER);
		
		
	}

}
