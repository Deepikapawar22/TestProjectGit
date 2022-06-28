package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandling {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "F:\\Deepika\\Testing\\Software\\chromedriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
			//1st way not recommended
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='1']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='2']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='-1']")).click();
			
			//2nd way By creating list of all radio buttons
			List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
			System.out.println("Total radio Buttons:-" + radios.size());
			System.out.println(radios.get(1).isEnabled());//Male Radio Button is enabled or not
			System.out.println(radios.get(0).isDisplayed());//Female Radio Button is displayed or not
			System.out.println(radios.get(2).isSelected());//Custom radio Button is selected or not
			Thread.sleep(3000);
			radios.get(1).click();
			Thread.sleep(3000);
			System.out.println(radios.get(2).isSelected());// Custom radio Button is selected or not
			
			//3rd Way correct way
			List<WebElement> radios1 = driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
			System.out.println("Tatal test;-"+ radios.size());
			String ExpectedResult = "female";
			for (int i=0; i<radios1.size(); i++) {
				if(radios1.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
				radios1.get(i).click();
				System.out.println(ExpectedResult+"Clicked");
				break;
		}

	}

		
	}
			}
