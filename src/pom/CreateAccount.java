package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	// This class will store all the locators and Method for Create an Account
	
	WebDriver driver;
	
	By email=By.xpath("//input[@id='email_create']");
	
	By createAccount=By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]");
	
	By gender=By.name("id_gender");
	
	By fName=By.xpath("//input[@id='customer_firstname']");
	
	By lName=By.xpath("//input[@id='customer_lastname']");
	
	By Email=By.id("email");
	
	By passWord=By.name("passwd");
	
	By addFName=By.xpath("//input[@id='firstname']");
	
	By addLName=By.xpath("//input[@id='lastname']");
	
	By address=By.xpath("//input[@id='address1']");
	
	By city=By.id("city");
	
	By state=By.xpath("//select[@id='id_state']");
	
	By postCode=By.xpath("//input[@id='postcode']");
	
	By Country=By.name("id_country");
	
	By phone=By.name("phone_mobile");
	
	By aAddress=By.xpath("//input[@id='alias']");
	
	By Register=By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]");
	
	
	public CreateAccount(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void typeEmail()
	{
		driver.findElement(email).sendKeys("friendly.autosale@yahoo.com");
	}
	public void clickCreateAccount()
	{
		driver.findElement(createAccount).click();
	}
	public void gender()
	{
		driver.findElement(gender).click();
	}
	public void Fname()
	{
		driver.findElement(fName).sendKeys("Ashik");
	}
	public void LName()
	{
		driver.findElement(lName).sendKeys("Islam");
	}
	public void Email()
	{
		driver.findElement(Email).sendKeys("friendly.autosale@yahoo.com");
	}
	public void typePasswoord()
	{
		driver.findElement(passWord).sendKeys("touhid123");
	}
	public void typeAddfName()
	{
		driver.findElement(addFName).sendKeys("Ashik");
	}
	public void typeAddLName()
	{
		driver.findElement(addLName).sendKeys("Islam");
	}
	public void typeAddress()
	{
		driver.findElement(address).sendKeys("7040 Black Horse");
	}
	public void  typeCity()
	{
		driver.findElement(city).sendKeys("Egg Harbor Twp");
	}
	public void typeState()
	{
		new Select (driver.findElement(state)).selectByVisibleText("New Jersey");
	}
	public void typeCode()
	{
		driver.findElement(postCode).sendKeys("08234");
	}
	public void typeCountry()
	{
		driver.findElement(Country).sendKeys("USA");
	}
	public void typePhone()
	{
		driver.findElement(phone).sendKeys("609-646-5500");
	}
	public void typeAaddress()
	{
		driver.findElement(aAddress).sendKeys("Dhaka");
	}
	public void ClickReg()
	{
		driver.findElement(Register).click();
	}

}
