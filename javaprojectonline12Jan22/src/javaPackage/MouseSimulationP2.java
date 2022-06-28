package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulationP2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\\\Deepika\\\\Testing\\\\Software\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");

		// Switching to frame
		List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames:-" + allframes.size());

		for (int i = 0; i < allframes.size(); i++) {
		driver.switchTo().frame(i);// Switchinh in side frame
			if (driver.findElement(By.id("draggable")).isDisplayed()
				&& driver.findElement(By.id("droppable")).isDisplayed());

		Actions act = new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build()
					.perform();
		System.out.println("Element found in " + (i + 1) + " Frames");

		}
	}
}