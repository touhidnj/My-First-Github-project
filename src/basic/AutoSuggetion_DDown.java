package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion_DDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	Thread.sleep(2000);
	     // Normal Way
		/*driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();     // Select FROM option and click
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("sydny");      // Pass value at from 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN); // go down by (Keys.ARROW_DOWN)
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);*/ // select and Enter by (Keys.ENTER)
	
	// By creating webelemnt go variable
	driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
	Thread.sleep(2000);
     WebElement go=	driver.findElement(By.xpath("//input[@placeholder='From']"));
    go.sendKeys("Dubai");  
	Thread.sleep(3000); 
	go.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
	go.sendKeys(Keys.ENTER);
		
	}

}
