package javaPackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Deepika\\Testing\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		// 1st way not recommended but mostly used
		List<WebElement> birthMonth = driver.findElements(By.xpath("//*[@title='Month']/option"));
		System.out.println("Total Drop Down list :-" + birthMonth.size());
		System.out.println(birthMonth.get(8).isEnabled()); // True
		birthMonth.get(8).click();// September
		Thread.sleep(3000);
		// 2nd Way

		WebElement bm = driver.findElement(By.xpath("//*[@title='Month']"));
		Select month = new Select(bm);// select class parameterized constructor
		month.selectByVisibleText("Apr");// Visible by selected text- apr
		Thread.sleep(3000);
		month.selectByValue("12");// Select by value- dec
		Thread.sleep(3000);
		month.selectByIndex(10);// Select by Index - Nov
		Thread.sleep(3000);
		System.out.println(month.getFirstSelectedOption().getText());

		// 3rd way - will store all drop down values
		List<WebElement> dropdown = month.getOptions();
		System.out.println("Total Drop Down value:-" + dropdown.size());
		System.out.println(month.getOptions());// Shows List of WebElement
		for (int i = 1; i < dropdown.size(); i++) {
		String dropdownValues = dropdown.get(i).getText();
		if (dropdownValues.equalsIgnoreCase("Aug")) {
				dropdown.get(i).click();
				
		//4th Way - Check If Drop Down support Multi selction
		System.out.println(month.isMultiple());
		month.selectByVisibleText("Apr");// Visible by selected text- apr
		Thread.sleep(3000);
		month.selectByValue("12");// Select by value- dec
		Thread.sleep(3000);
		month.selectByIndex(10);// Select by Index - Nov
		Thread.sleep(3000);
		
		//deselect Drop Down value
		month.deselectByVisibleText("Apr");// Visible by selected text- apr
		Thread.sleep(3000);
		month.deselectByValue("12");// Select by value- dec
		Thread.sleep(3000);
		month.deselectByIndex(10);// Select by Index - Nov
		Thread.sleep(3000);
		month.deselectAll();
		
		//5th Way
		bm.sendKeys("Feb");
		
		//6th Way
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");

			}

		}
	}
}
