package scripts_Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle_Demo {
	
	@Test
	public void WindowHandling(){
	System.setProperty("webdriver.chrome.driver", "P:\\Hybrid\\Selenium_Scripts\\drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	 driver.get("http://demo.guru99.com/popup.php");			
     driver.manage().window().maximize();		
             		
driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
     		
     String MainWindow=driver.getWindowHandle();		
     		
     // To handle all new opened window.				
         Set<String> s1=driver.getWindowHandles();		
     Iterator<String> i1=s1.iterator();		
     		
     while(i1.hasNext())			
     {		
         String ChildWindow=i1.next();		
         		
         if(!MainWindow.equalsIgnoreCase(ChildWindow))			
         {    		
              
                 // Switching to Child window
                 driver.switchTo().window(ChildWindow);	
                 
                 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gaurav.3n@gmail.com");                			
                 
                 driver.findElement(By.xpath("//input[@type='submit']")).click();			
                              
			// Closing the Child Window.
                     driver.close();		
         }		
     }		
     // Switching to Parent window i.e Main Window.
         driver.switchTo().window(MainWindow);				
 }
}		


