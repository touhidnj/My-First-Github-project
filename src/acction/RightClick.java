package acction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//Go to the webpage
   driver.get("https://jqueryui.com/slider/#colorpicker");
   driver.manage().window().maximize();
   Thread.sleep(1000);
   //Do Scroll Down
   JavascriptExecutor page=(JavascriptExecutor)driver;
	page.executeScript("scroll(0, 500);");
	Thread.sleep(2000);
	//Jump to Iframe
	WebElement iframe=driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
	driver.switchTo().frame(iframe);
     // Find   slider webElement and store at red Variable
	WebElement red=driver.findElement(By.xpath("//body/div[@id='red']/span[1]"));
	//Create Actions class object
		Actions action=new Actions(driver);
		// To perform Right Click call action.contextClick(), pass variable and order to perform
		action.contextClick(red).perform();
	
	
	

	}

}
