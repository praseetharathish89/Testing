package scripts_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {	
				
		System.setProperty("webdriver.chrome.driver","P:\\Hybrid\\Selenium_Scripts\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	    
	    Actions action = new Actions(driver);
	    
	 	Dimension d = new Dimension(300,1080);
     	//Resize current window to the set dimension
     	   driver.manage().window().setSize(d);

	    WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
	    action.contextClick(link).perform();
	    // Click on Edit link on the displayed menu options
	    WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
	    element.click();
	    // Accept the alert displayed
	    Thread.sleep(1500);
	    driver.switchTo().alert().accept();
	    // Closing the driver instance
	    //driver.quit();
 	Point p = new Point(0,3000);
     	
     	//Minimize the current window to the set position
     	        driver.manage().window().setPosition(p);
     	        
	
	}
	
}
