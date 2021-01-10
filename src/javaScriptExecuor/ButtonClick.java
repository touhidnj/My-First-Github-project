package javaScriptExecuor;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//id=("iframeResult"));
		// here directly we are passing iframe id into the frame()
		driver.switchTo().frame("iframeResult");   
		
		// create javascript executor object
		JavascriptExecutor click=(JavascriptExecutor) driver;
		
		//object  click.  has lot of function will be apprear and select "executeScript(arg0, arg1)" and pass  WebElement value what we want to click
		click.executeScript("myFunction()");
		Thread.sleep(2000);
		
		//Accecpt the pop-up
		driver.switchTo().alert().accept();
		
		
	}

}
