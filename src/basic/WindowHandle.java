 package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	   driver.get("https://www.salesforce.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(1000);
	   
	   // First click on 'Try For Free' icon. it will be open new widow 
		driver.findElement(By.xpath("//span[contains(text(),'Try For Free')]")).click();
		Thread.sleep(4000);
		
		// for multiple window handle we need to follow selenium 'driver.getWindowHandles()'  in built method. we need to store that method in a variable.
		// variable datat type will be 'Set <String>'
		Set <String>janala=driver.getWindowHandles();
		System.out.println("This is janala value :"+janala);
		
		// Now with this 'janala' variable create seleneium-java 'iterator' Method. Because By this iterator we can decide which window we can swith.
		Iterator<String> iterator=janala.iterator();
	//  store 'iterator.next()' method in parent variable
		String parentJanala=iterator.next();    
		// print parent window value		
		System.out.println("This is parent window :"+parentJanala);   
		//Store 'iterator.next()' method in child variable
		String childjanala=iterator.next();       
		// print child window value		
		System.out.println("This is child window :"+childjanala);
		
		//// Now pass the window name where I want to go in this Method "driver.switchTo().window(childjanala);
		driver.switchTo().window(childjanala);   
		
		// Now pass values in child window as needed
		driver.findElement(By.name("UserFirstName")).sendKeys("Ashik");
		driver.findElement(By.name("UserLastName")).sendKeys("Islam");
		driver.findElement(By.name("UserTitle")).sendKeys("Manager Friendly Auto Sale");
		Thread.sleep(4000);
		
		// close child window		
		driver.close();  
		// come Back parent window
		driver.switchTo().window(parentJanala);   
		// Close parent window
		driver.close();      
		
		
	}

}
