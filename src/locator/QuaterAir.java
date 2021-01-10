package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuaterAir {
public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.qatarairways.com/");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			
			//driver.switchTo().alert().dismiss(); 
			driver.navigate().refresh();
			Thread.sleep(1000);
			
			JavascriptExecutor page=(JavascriptExecutor)driver;
			page.executeScript("scroll(0, 400);");
			Thread.sleep(3000);
			
			
			
	}

}
