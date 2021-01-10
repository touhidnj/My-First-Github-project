package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Request a Demo')]")).click();   
		
		JavascriptExecutor page=(JavascriptExecutor)driver;      // For Scrolling the Page
		page.executeScript("scroll(0, 1000);");
		Thread.sleep(2000);
		
		driver.findElement(By.id("interest_sell_c0")).click();    //Select the Box and Click
		driver.findElement(By.name("interest_serve_c")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("interest_sell_c0")).click();   // This clik for De-Select */
		driver.findElement(By.name("interest_serve_c")).click();
		Thread.sleep(2000);
		System.out.println("Total Check Box :"+driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']")).size());
		
	
		
	}

} 
