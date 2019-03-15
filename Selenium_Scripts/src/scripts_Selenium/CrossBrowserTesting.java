package scripts_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {


	WebDriver driver;
	
	@Parameters("browser")
		
	@BeforeTest
	public void crossbrowser(String browser) throws Exception{
		
	if(browser.equalsIgnoreCase("chrome")){
		
		System.setProperty("webdriver.chrome.driver","P:\\Hybrid\\Selenium_Scripts\\drivers\\chromedriver.exe");
		WebDriver driver = new HtmlUnitDriver();
	    driver.get("http://demo.guru99.com/test/delete_customer.php");	
		
	}
	else if(browser.equalsIgnoreCase("firefox")){
		
		System.setProperty("webdriver.gecko.driver","P:\\Hybrid\\Selenium_Scripts\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://demo.guru99.com/test/delete_customer.php");	
		
		
	}else{
		
		throw new Exception("Browser is incorrect");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

/*@Test
public void printingresult(){
	
	driver.get("http://demo.guru99.com/V4/");
	//Find user name
	WebElement userName = driver.findElement(By.name("uid"));
	//Fill user name
	userName.sendKeys("guru99");
	//Find password
	WebElement password = driver.findElement(By.name("password"));
	//Fill password
	password.sendKeys("guru99");
	System.out.println("Browser is Running......");
	
	driver.close();
	
	}*/


}
