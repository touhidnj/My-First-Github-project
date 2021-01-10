package acction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	   driver.get("https://jqueryui.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(1000);
		
	   // Click on Droppable option
		driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
		
		// To see properly make scroll down
				JavascriptExecutor page=(JavascriptExecutor)driver;
				page.executeScript("scroll(0, 300);");
				Thread.sleep(3000);
				
		
		//Droppable items are in another frame. So we need to go that frame First by creating frame object
		WebElement frame1=driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
		// Now call switch method to jump into the frame
		driver.switchTo().frame(frame1);
		
		// find dragable element and store in drag variable
		WebElement drag=driver.findElement(By.id("draggable"));
		// find droppable element and store in drop variable
		WebElement drop=driver.findElement(By.id("droppable"));
		
		// Create Action class and object to perform 
		Actions action=new Actions(driver);
		
		// By action object call selenium-java inbuilt method ".dragAndDrop(source, target)" and pass the source and target 
		//  for perform the action now call ".perform()" Method
		action.dragAndDrop(drag, drop).perform();
	}

}
