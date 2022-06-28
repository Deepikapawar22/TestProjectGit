package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ObjectRepositoryP {

	public static void main(String[] args) throws Exception {
		// Specify Location of property file
		File src = new File(
				"C:\\Users\\MFG\\eclipse-workspace\\javaprojectonline12Jan22\\Repository\\Objrct_repo_properties");
		
		// Create file input string class object to load the file
		FileInputStream fis = new FileInputStream(src);
		
		// Create properties class object to read properties file
		Properties pro = new Properties();
		pro.load(fis);
		
		System.setProperty("webdriver.driver.chrome","F:\\Deepika\\Testing\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pro.getProperty("URL"));
		//get property method accept key and returns the value of same key
		
		
		

	}

}
