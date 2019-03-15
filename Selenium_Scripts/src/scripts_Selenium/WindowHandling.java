package scripts_Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
public static void main(String[] args) throws InterruptedException{
System.setProperty("webdriver.chrome.driver", "P:\\Hybrid\\Selenium_Scripts\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();	
String appurl="https://curie-doctor.firebaseapp.com/#/app/login";
driver.get(appurl);
driver.findElement(By.id("username")).sendKeys("amit@gmail.com");	
driver.findElement(By.id("password")).sendKeys("amit123");
	//driver.findElement(By.id("password")).sendKeys(Keys.TAB);
	//driver.findElement(By.id("signin")).sendKeys(Keys.ENTER);
driver.findElement(By.id("signin")).click();
Thread.sleep(1000);
//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//driver.navigate().refresh();

String parent = driver.getWindowHandle();

Set<String> allwindows=driver.getWindowHandles();

for(String child:allwindows){
	
	if(!parent.equalsIgnoreCase(child)){
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.close();
	}
	
	driver.switchTo().window(parent);
	
	System.out.println(driver.getTitle());
	
	String appurl1="https://www.toolsqa.com/automation-practice-form";
	driver.get(appurl1);
	
	WebElement element=driver.findElement(By.id("sex-0"));
	element.click();
	
	driver.findElement(By.id("profession-1")).click();
	
	boolean staus = driver.findElement(By.id("sex-0")).isSelected();
	
	if(staus==true){
		
		System.out.println("Naadum Naatu Makkalum Naasamai Pogattum");
	}
	else{
		
		System.out.println("Praveen*****Raja");
	}
	
}



		

		
		

	


		
}
}
