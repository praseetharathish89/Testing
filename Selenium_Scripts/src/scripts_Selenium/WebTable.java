package scripts_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	
	
	@Test
	public void Nomral_WebTable(){
		

		System.setProperty("webdriver.chrome.driver","P:\\Hybrid\\Selenium_Scripts\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/accessing-nested-table.html");	

		String innerText = driver.findElement(
			By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText(); 		
	        System.out.println(innerText); 
	
	        
	        String baseUrl = "http://demo.guru99.com/test/newtours/";
	    	//WebDriver driver = new FirefoxDriver();

	    	driver.get(baseUrl);
	    	String innerText3 = driver.findElement(By
	    		.xpath("//table[@width=\"270\"]/tbody/tr[4]/td"))
	    		.getText(); 		
	    	System.out.println(innerText3); 
	    	driver.quit();
		
	
		
	}

}
