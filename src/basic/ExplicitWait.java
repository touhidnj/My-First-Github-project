package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	   driver.get("https://www.ebay.com/");
	   driver.manage().window().maximize();
	  
	   WebElement toys= driver.findElement(By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[9]/a[1]"));
	  
	  Actions acction=new Actions(driver);
	    acction.moveToElement(toys).perform(); 
	    
	 // Here we need to put Explicit wait to find "Action Figures" WebElement
	    // For Explicit wait we need selenium "WebdriverWait" class. and we have to create an object for this class
	    // This class accept driver refarance and time duration
	     WebDriverWait obj=new WebDriverWait(driver, 10);
	    	   
	   //With the help of obj object call  obj.until(arg0) inside we need to write ExpectedConditions
	   // then put . and select visibilityOfElementLocated(By.location) and enter location
	    
	    obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Action Figures')]"))).click();
		

	}

}
