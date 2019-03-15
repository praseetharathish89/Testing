package scripts_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver {
	
	@Test
	
	public void Mouse_Over_Oper() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "P:\\Hybrid\\Selenium_Scripts\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		Thread.sleep(1000);
		 WebElement link_Home = driver.findElement(By.linkText("Home"));
         WebElement td_Home = driver
                 .findElement(By
                 .xpath("//html/body/div"
                 + "/table/tbody/tr/td"
                 + "/table/tbody/tr/td"
                 + "/table/tbody/tr/td"
                 + "/table/tbody/tr"));    
          
         Actions builder = new Actions(driver);
         Action mouseOverHome = builder.moveToElement(link_Home).build();
          
         String bgColor = td_Home.getCssValue("background-color");
         System.out.println("Before hover: " + bgColor);        
         mouseOverHome.perform();        
         bgColor = td_Home.getCssValue("background-color");
         System.out.println("After hover: " + bgColor);
        // driver.close();
         
         String baseUrl = "http://www.facebook.com/"; 
         driver.get(baseUrl);
         WebElement txtUsername = driver.findElement(By.id("email"));

         Actions builder2 = new Actions(driver);
         Action seriesOfActions = builder.moveToElement(txtUsername).click().keyDown(txtUsername, Keys.SHIFT) // type Upper Case
         	.sendKeys(txtUsername, "hello").keyUp(txtUsername, Keys.SHIFT).doubleClick(txtUsername) // Highlight text
         	.contextClick().build();
         seriesOfActions.perform() ;
         driver.quit();
 }

	}
	

