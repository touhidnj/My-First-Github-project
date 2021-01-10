package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		
		JavascriptExecutor page=(JavascriptExecutor)driver;      // For Scrolling the Page
		page.executeScript("scroll(0, 250);");
		Thread.sleep(2000);
		
		List<WebElement> rowsNumber = driver.findElements(By.xpath("//body/div[@id='wrapper']/div[@id='leftcontainer']/table[1]/tbody/tr"));
		System.out.println("Total number of Rows are :" + rowsNumber.size());
		int rowsize=rowsNumber.size();
		
		List<WebElement>  columnNumber = driver.findElements(By.xpath("//body/div[@id='wrapper']/div[@id='leftcontainer']/table[1]/tbody/tr[1]/td"));
		System.out.println("Total number of Columns are :" + columnNumber.size());
		int columnsize=columnNumber.size();
		
		 for (int i=1; i<rowsize; i++) {
			 for(int j=1; j<columnsize; j++) {
				 
			System.out.println(driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='leftcontainer']/table[1]/tbody/tr["+i+"]/td["+j+"]")).getText());
			 }
		 }
		
				
		
	}

}
