package javaPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandlingP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Deepika\\Testing\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();

		// Print how many windows are open

		Thread.sleep(2000);
		Set<String> PopupID = driver.getWindowHandles();
		System.out.println(PopupID);
		System.out.println(PopupID.size());

		Iterator<String> abc = PopupID.iterator();
		String window1 = abc.next();
		String window2 = abc.next();

		//Print Title of popup window2
		driver.switchTo().window(window2);
		System.out.println(window2);/// will get alphnumeric ID of Window2
		System.out.println(driver.getTitle());

		//Print Title of popup window1
		driver.switchTo().window(window1);
		System.out.println(window1);/// will get alphnumeric ID of Window2
		System.out.println(driver.getTitle());
		driver.close();// close current window
		driver.quit();// close current as well as associated window
	}

}
