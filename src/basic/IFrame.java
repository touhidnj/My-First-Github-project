package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//driver.switchTo().frame(0);                                // Go to iframe by index NO
		//driver.switchTo().frame("iframeResult");        // // Go to iframe by String value
		
		WebElement frame1= driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);                               // // Go to iframe by WebElement
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Thread.sleep(1000);
		driver.switchTo().parentFrame();    // Back to parent frame
		
		
		
	}

}
