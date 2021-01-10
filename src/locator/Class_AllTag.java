package locator;

import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_AllTag {
	//Use Class and TagName

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//Find total slider by using Class locator
		
		int imageno=driver.findElements(By.className("homeslider-description")).size();
		System.out.println("Total image at slider has :"+imageno);
		
		// Find all links by use Tag. Remember in html <a tag means anchor tag always refer links.
	List <WebElement> alltags=	driver.findElements(By.tagName("a"));
	System.out.println("Total number of the link of this page is :"+alltags.size());
	
	for (WebElement i:alltags) {
		System.out.println(i.getText());
		System.out.println(i.getAttribute("href"));
	}
	
	
	
	
	
	
	
		

		
	}

}
