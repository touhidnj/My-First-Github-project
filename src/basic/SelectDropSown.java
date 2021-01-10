package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropSown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(text(),'Request a Demo')]")).click();       // click on Request A Demo
		WebElement ddown=driver.findElement(By.name("employees_c"));
		Select select=new Select(ddown);
		
		//select.selectByValue("level6");  // By Value
		//select.selectByVisibleText("1,001 - 2,500 employees");   // By VisibleText
		select.selectByIndex(8);      // By Index
		
		
	}

}
