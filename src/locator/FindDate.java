package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindDate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][contains(@aria-label,'Feb 10 2021')]")).click();
		Thread.sleep(4000);
		
	}

}
