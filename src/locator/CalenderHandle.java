package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                                                                                           // NOT WORKING
 public class CalenderHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement calender= driver.findElement(By.name("ctl00$mainContent$view_date1"));
		
		String date ="12-11-2021";
		
		DateByjs(driver, calender, date);
		
		
	}
	public static void DateByjs(WebDriver driver, WebElement element, String date) {
		JavascriptExecutor js= ((JavascriptExecutor) driver );
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
		
	}

}
