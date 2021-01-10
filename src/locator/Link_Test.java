package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Test {	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//ID & Name locator
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
	driver.findElement(By.name("submit_search"))	.click();
	
	// Linktext & partial Linktext locator( Use any one)
	driver.findElement(By.linkText("Printed Chiffon Dress")).click();
	//driver.findElement(By.partialLinkText("Chiffon Dress")).click(); 
	
	
	
	}

}
