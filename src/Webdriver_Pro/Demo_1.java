package Webdriver_Pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.walmart.com/");
	}

}
 