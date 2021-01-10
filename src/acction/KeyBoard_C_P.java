package acction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_C_P {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
   driver.get("https://extendsclass.com/text-compare.html");
   driver.manage().window().maximize();
	
   JavascriptExecutor page=(JavascriptExecutor)driver;
	page.executeScript("scroll(0, 500);");
	Thread.sleep(250);
	
	// Find Element and store in variable source1
	WebElement source1=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]"));
	
	//Create Actions class object
	Actions action=new Actions(driver);
	
	//Call  "action.keyDown(target, key)" Method. Pass variable name and what I want to do with keys like (Keys.shift/contrl...)
	//Then sendkeys like(a=all and c=Copy) here is multiple action thats why  build().perform() .
	action.keyDown(source1, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	
	Thread.sleep(3000);
	
	WebElement source2=driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[6]"));
	//Here I want to see hole highlighted thats why used extra option (sendKeys("a"))
	action.keyDown(source2, Keys.CONTROL).sendKeys("a").sendKeys("v").sendKeys("a").build().perform();
	
	
	
	
	
	
	
	

	}

}
