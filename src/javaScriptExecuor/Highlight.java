package javaScriptExecuor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://connect.secure.wellsfargo.com/auth/login/present?origin=cob");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//create javascriptExecutor object		
		JavascriptExecutor click=(JavascriptExecutor) driver;
		
		//Find the WebElement which I want to high light and store in a variable		
		WebElement search=driver.findElement(By.xpath("//form[@id='frmSearch']"));
		
		// By the object now call executeScript(--,--)
		// For highlight argument formula is (arguments[0].style.border='4px groove blue) 
		// Here we can change px and color name as we want
		// then WebElement variable name
		click.executeScript("arguments[0].style.border='4px groove blue'", search);
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}

}
