package acction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleSlider {

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
     // Find red slider webElement and store at red Variable
	WebElement red=driver.findElement(By.xpath("//body/div[@id='red']/span[1]"));
	// Find green slider webElement and store at green Variable
	WebElement green=driver.findElement(By.xpath("//body/div[@id='green']/span[1]"));
	//Create Actions class
	Actions action=new Actions(driver);
	//Call red variable by action "dragAndDropBy(red, -100, 80)"  Method.
	//Insert paramiter and order to .perform();
	action.dragAndDropBy(red, -80, 100).perform();
	Thread.sleep(3000);
	//Call green variable by action "dragAndDropBy(green, 000, 000)"  Method.
		//Insert parameter and order to .perform();
    action.dragAndDropBy(green, 30, 40).perform();
    
    

	}

}
