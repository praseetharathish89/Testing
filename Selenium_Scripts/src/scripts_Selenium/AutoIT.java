package scripts_Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","P:\\Hybrid\\Selenium_Scripts\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		 driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");			
		 WebElement browse =driver.findElement(By.id("uploadfile"));
		 //pass the path of the file to be uploaded using Sendkeys method
		 browse.sendKeys("C:\\JarSupport\\BillReceipt.pdf");
		 //'close' method is used to close the browser window
		 browse.click();
		 //To call the AutoIt script
		 Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3\\Uploadfile.exe");
		 //'close' method is used to close the browser window
		 driver.close();
		 driver.close();

	}

}
