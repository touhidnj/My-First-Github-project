package javaScriptExecuor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://connect.secure.wellsfargo.com/auth/login/present?origin=cob");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor page=(JavascriptExecutor)driver;      
		
		// For Scrolling the Page by parameter, call object and put value like: ("scroll(0, 100);")
		page.executeScript("scroll(0, 100);");
		Thread.sleep(2000); 
		
		// For Scrolling the Page up to any webElement.
		// Create variable for that WebElement
		WebElement about=driver.findElement(By.xpath("//a[contains(text(),'About Wells Fargo')]"));
		
		// Call object. put argument ("arguments[0].scrollIntoView(true);"  ,  variable name)
		page.executeScript("arguments[0].scrollIntoView(true);", about);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
