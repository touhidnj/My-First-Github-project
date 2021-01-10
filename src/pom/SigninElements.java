package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninElements {
	// This class will store all the locators and Method for Sign in  an Account
	
	WebDriver driver;

	
	By clicksign=By.xpath("//a[contains(text(),'Sign in')]");
	By email=By.xpath("//input[@id='email']");
	By password=By.xpath("//input[@id='passwd']");
	By submit = By.id("SubmitLogin");
	
	
	public SigninElements (WebDriver driver) 
	{
		this.driver=driver;
	}
	public void SigninClick()
	{
		driver.findElement(clicksign).click();
	}
	public void typeemail()
	{
		driver.findElement(email).sendKeys("touhidtx@gmail.com");
	}
	public void typepassword()
	{
		driver.findElement(password).sendKeys("touhid123");
	}
	public void clickSubmit()
	{
		driver.findElement(submit).click();
	}


}
