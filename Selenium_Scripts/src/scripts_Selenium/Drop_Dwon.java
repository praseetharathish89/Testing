package scripts_Selenium;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Drop_Dwon {
	
	@Test
	
	public void image_Source() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "P:\\Hybrid\\Selenium_Scripts\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		Thread.sleep(1000);
		
		//WebElement element=driver.findElement(By.xpath("//img[@src='/statics/site/images/cbz-logo.png']"));
		
		Select s1=new Select(driver.findElement(By.xpath("//table/tbody/tr[11]/td[2]/select")));
		
		s1.selectByIndex(3);
		s1.selectByValue("ALBANIA");
		s1.selectByVisibleText("ARGENTINA");
		
		
	
		
		
	}

}
