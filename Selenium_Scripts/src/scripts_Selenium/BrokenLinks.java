package scripts_Selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {	
		
	String url="";
		
		System.setProperty("webdriver.chrome.driver","P:\\Hybrid\\Selenium_Scripts\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.zlti.com");	
	
	    
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    
	    System.out.println(links.size());
	    
	    Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
         url = it.next().getAttribute("href");
            
            System.out.println(url);
        }
	}

}
