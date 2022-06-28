package javaPackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable {

	public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "F:\\Deepika\\Testing\\Software\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://money.rediff.com/gainers");
	
	List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
	
	System.out.println("Total Number of companies:-" + allCompanies.size());
	List<WebElement> Totalcurrentprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	System.out.println("TotalCurrent Price :-" + Totalcurrentprice.size());
	String ExpectedCompName = "Mahindra CIE Auto";
	for (int i=0; i<allCompanies.size(); i++)
	{
		if(allCompanies.get(i).getText().equalsIgnoreCase(ExpectedCompName)){
			System.out.println(allCompanies.get(i).getText() + "=====" + Totalcurrentprice.get(i).getText());
			allCompanies.get(i).click();
			break;
		}
		
		
	}
	}

}
