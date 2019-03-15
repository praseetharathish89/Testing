package scripts_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Image_Click {
	
	@Test
	
	public void image_Source() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "P:\\Hybrid\\Selenium_Scripts\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/cricket-match/live-scores");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@src='/statics/site/images/cbz-logo.png']")).click();
		
		
	}

}
