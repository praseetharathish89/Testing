package scripts_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesInsideFrames {
	

public static void main(String[] args) {
	

System.setProperty("webdriver.chrome.driver","P:\\Hybrid\\Selenium_Scripts\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://demo.guru99.com/test/guru99home/");	
driver.manage().window().maximize();

int size = driver.findElements(By.tagName("iframe")).size();
System.out.println(size);

for(int i=0; i<size; i++){
driver.switchTo().frame(i);
int total=driver.findElements(By.xpath("html/body")).size();
System.out.println("total"+total);
driver.switchTo().defaultContent();
}
    }
}