package javaPackage;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitP {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Deepika\\Testing\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("What is selenium");

		// Handling auto suggession
		List<WebElement> AllSuggesions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total Auto Suggesions:-" + AllSuggesions.size());

		for (int i = 0; i < AllSuggesions.size(); i++) {
			String ExpectedResult = "What is selenium grid";
			if (AllSuggesions.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
				AllSuggesions.get(i).click();
				System.out.println(ExpectedResult + "Clicked");
			}

		}
	}

}
