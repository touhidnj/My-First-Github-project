package alartHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAlert {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://html.com/input-type-file/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	JavascriptExecutor page=(JavascriptExecutor)driver;   //import org.openqa.selenium.JavascriptExecutor; for scroll page
	page.executeScript("scroll(0,1000);");                            // scroll range

	driver.findElement(By.name("fileupload")).sendKeys("D:\\Access modifier.docx"); //Find upload button and sendkeys in computer file location path then\ file name.
	Thread.sleep(3000);
	driver.close();
	
	}

}
