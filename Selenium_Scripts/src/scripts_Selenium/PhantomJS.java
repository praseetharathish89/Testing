package scripts_Selenium;

//import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJS {
	
	public static void main(String[] args){
		
        //File file = new File("P:\\Hybrid\\Selenium_Scripts\\drivers\\phantomjs.exe");				
        System.setProperty("phantomjs.binary.path","P:\\Hybrid\\Selenium_Scripts\\drivers\\phantomjs.exe"/*file.getAbsolutePath()*/);		
        WebDriver driver = new PhantomJSDriver();	
        driver.get("http://www.google.com");
        System.out.println("Page title is: " + driver.getTitle());		
        driver.quit();
	}

}
