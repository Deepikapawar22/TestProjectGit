package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class MouseSimulationP3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\\\Deepika\\\\Testing\\\\Software\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");

		// Switching frames
		List<WebElement> allFrames = driver.findElements(By.tagName("iFrame"));
		System.out.println("Total frames" + allFrames.size());
		driver.switchTo().frame(0);
		WebElement draggableElement = driver.findElement(By.id("draggable"));

		// Drag by using Action class
		Actions act = new Actions(driver);
		act.dragAndDropBy(draggableElement, 30, 20).build().perform();

		// drag and hold using click and hold using coordinates
		Thread.sleep(3000);
		act.clickAndHold(draggableElement).dragAndDropBy(draggableElement, 30, 30).build().perform();

	}

}
