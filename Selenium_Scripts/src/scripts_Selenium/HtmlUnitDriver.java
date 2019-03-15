package scripts_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;	

public class HtmlUnitDriver {
	
	
	public static void main(String[] args){
		
		
		WebDriver driver = new org.openqa.selenium.htmlunit.HtmlUnitDriver();
		 //WebDriver driver = new HtmlUnitDriver(BrowserVersion.)
		 // Set implicit wait 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 // Open "Google.com and search SoftwareTestingMaterial.com"
		 driver.get("https://www.google.com");
	
		 System.out.println("I am at " +driver.getCurrentUrl());
		
	}

}
