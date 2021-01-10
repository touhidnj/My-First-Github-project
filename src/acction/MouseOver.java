package acction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	   driver.get("https://www.ebay.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(1000);
		
	   // I want to take acction on Toyes. so first find toys element and store in a variable
	  WebElement toys= driver.findElement(By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[9]/a[1]"));
		
		// Now create acction class for perform toyes element 
	  Actions acction=new Actions(driver);
	  // By the help of action object here i call '.moveToElement(Target)' inside the Target area I put 'toys' Variable
	  // After that calling '.perform()' Method 
	  acction.moveToElement(toys).perform(); 
	  
	  Thread.sleep(5000);
	  driver.close();
		
		
	}

}
