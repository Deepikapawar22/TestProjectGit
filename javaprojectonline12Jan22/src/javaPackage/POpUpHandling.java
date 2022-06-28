package javaPackage;

import java.util.Set;

import java.util.Iterator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class POpUpHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\Deepika\\Testing\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:demoqa.com/browser-windows");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();
		Thread.sleep(3000);
		
		//Print How many windows are open
		Set<String> PopupID = driver.getWindowHandles();
		System.out.println("PopupID");
		System.out.println(PopupID.size());
		
		Iterator<String> abc = PopupID.iterator();
		String Window1 = abc.next();
		String Window2 = abc.next();
		
		//Print Title of Open Window2(Child Window)
		driver.switchTo().window(Window2);
		System.out.println("Window2");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		//Print Title of open window1
		driver.switchTo().window(Window1);
		System.out.println("Window1");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();//close all open window
		
		
		

	}

}


