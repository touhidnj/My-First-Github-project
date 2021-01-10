package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_01 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		String exptitle="OrangeHRM";
			
		String Title= driver.getTitle();
		
		if (exptitle.equals(Title)) {
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is faild");
		}
		Thread.sleep(2000);
		driver.close();
		
				
	}

}
