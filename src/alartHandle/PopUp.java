package alartHandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {
public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();         // delete all Cookies
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		
	    Alert alart= driver.switchTo().alert();                  // To create alart variable here I import org.openqa.selenium.Alert; ** To handle Alert selenium has Alert option
		alart.getText();                                                       // Then I called alart . getText() inbuilt method for alart text
		System.out.println(alart.getText());                   // here i want to print the text of particular Alert.
		alart.accept();                                                          // here i accept the alert
		
	   // alart.dismiss();   OR	driver.switchTo().alert().dismiss();               => This is for dismiss the alert
		driver.close();
		
	}

}
