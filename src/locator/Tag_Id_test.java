package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_Id_test {
// Use CSS selector
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Ashik");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("123");
		
		
		
		
	}

}
