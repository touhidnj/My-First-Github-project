package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAll {
public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			// or use
			driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query']")).sendKeys("Dresses");
			driver.findElement(By.xpath("//button[@name='submit_search' or @class='btn btn-default button-search']")).click();
			// and use
			driver.findElement(By.xpath("//select[@id='selectProductSort' and @class='selectProductSort form-control']")).sendKeys("in stock");
			
			driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")).click();
			JavascriptExecutor page=(JavascriptExecutor)driver;
			page.executeScript("scroll(0, 500);");
			
			Thread.sleep(2000);
			
			driver.findElement(By.className("icon-plus")).click();
		driver.findElement(By.xpath("//button[contains(@name,'Sub')]")).click();  // contains() use
		
	
	}

}
