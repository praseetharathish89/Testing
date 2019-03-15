package scripts_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {
	
	
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {	
		
		System.setProperty("webdriver.chrome.driver","P:\\Hybrid\\Selenium_Scripts\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	     JavascriptExecutor js = (JavascriptExecutor) driver;

     // Launch the application		
/*     driver.get("http://demo.guru99.com/test/guru99home/");

     //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
     driver.manage().window().maximize();

     // This  will scroll down the page by  1000 pixel vertical		
     js.executeScript("window.scrollBy(0,1500)");
}*/
     
     // Launch the application		
     driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");

     WebElement Element = driver.findElement(By.linkText("VBScript"));

     //This will scroll the page Horizontally till the element is found		
     js.executeScript("arguments[0].scrollIntoView();", Element);

	}

}
