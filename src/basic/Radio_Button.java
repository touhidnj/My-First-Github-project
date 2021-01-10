package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.singaporeair.com/en_UK/us/home#/book/bookflight");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		JavascriptExecutor page=(JavascriptExecutor)driver;
		page.executeScript("scroll(0, 200);");
		Thread.sleep(3000);
		
		// radio1 and radio2 variable we create for to use .isSelected() Method, That give us boolean Return.
          WebElement radio1=driver.findElement(By.id("redeemFlights"));  // For Redeem flights Radio Button
          WebElement radio2=driver.findElement(By.id("bookFlights"));    // For Book flights Radio button
          
          radio1.click();    // I said click Redeem flights Radio Button
         System.out.println(radio2.isSelected());    //Finding radio Button Selected or not By Variable.isSelected() Method
         System.out.println(radio1.isSelected()); 
          
         // To Check How many Radio Button has on the page and print on consol
       System.out.println("Total Radio Button This Page :"+ driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());  
	}

}
