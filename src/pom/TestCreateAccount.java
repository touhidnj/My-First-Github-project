package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCreateAccount {

public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		CreateAccount TestPage=new CreateAccount(driver);
		
		TestPage.typeEmail();
		
		TestPage.clickCreateAccount();
		
		TestPage.gender();
		
		TestPage.Fname();
		
		TestPage.LName();
		
		//TestPage.Email();
		
		TestPage.typePasswoord();
		
		TestPage.typeAddfName();
		
		TestPage.typeAddLName();
		
		TestPage.typeAddress();
		
		TestPage.typeCity();
		
		TestPage.typeState();
		
		TestPage.typeCode();
		
		TestPage.typeCountry();
		
		TestPage.typePhone();
		
		TestPage.typeAaddress();
		
		TestPage.ClickReg();
		
		
		
		
		
		
		
		
		
	}

}
