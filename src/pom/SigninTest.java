package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigninTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		SigninElements login=new SigninElements(driver);
		
		login.SigninClick();
		Thread.sleep(2000);
		login.typeemail();
		Thread.sleep(2000);
		login.typepassword();
		Thread.sleep(2000);
		login.clickSubmit();
		
		driver.quit();
		
		
		
		
	}

}
