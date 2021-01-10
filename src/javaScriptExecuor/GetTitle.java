package javaScriptExecuor;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.24livenewspaper.com/bangla-newspaper");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Create Java script object		
		JavascriptExecutor jsex=(JavascriptExecutor) driver;
		
		// Store return document.title; in script variable type string
		//  To get the title "return document.title;" is formula for any wepage 
		String script="return document.title;";
		
		//object  jsex. lot of function will be apprear and select "executeScript(arg0, arg1)" and pass value script variable
		// For print we need to store "jsex.executeScript(script); in to a string variable like "title". select add to cust string.
		String title= (String) jsex.executeScript(script);
		// now print the title 
		System.out.println(title);
		
		
		
		
		
	}

}
