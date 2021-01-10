package dATADriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		
			

		   FileInputStream file= new FileInputStream("D:\\selenium\\aDRegis.xlsx");
		   
		   
		   
		   XSSFWorkbook workbook = new XSSFWorkbook(file);
		   	  
		   XSSFSheet sheet=workbook.getSheet("Sheet1");          
		   
		   
		       int rowcount= sheet.getLastRowNum();      
		      //  int cellcount= sheet.getRow(0).getLastCellNum();
		        
		        
		        for (int i=0;  i<rowcount; i++) {
		        	
		        	XSSFRow currentrow= sheet.getRow(i);
		        	
		        	String First_Name=currentrow.getCell(0).getStringCellValue();
		        	String Last_name=currentrow.getCell(1).getStringCellValue();
		        	String Phone=currentrow.getCell(2).getStringCellValue();
		        	String Email=currentrow.getCell(3).getStringCellValue();
		        	String Address=currentrow.getCell(4).getStringCellValue();
		        	String City=currentrow.getCell(5).getStringCellValue();
		        	String State=currentrow.getCell(6).getStringCellValue();
		        	String Post_Code=currentrow.getCell(7).getStringCellValue();
		        	String Country=currentrow.getCell(8).getStringCellValue();
		        	String UserName=currentrow.getCell(9).getStringCellValue();
		        	String PassWord=currentrow.getCell(10).getStringCellValue();
		        	String Confarm_PassWord=currentrow.getCell(11).getStringCellValue();
		        	
		        	
		        	
		        	driver.findElement(By.name("firstName")).sendKeys(First_Name);
		        	driver.findElement(By.name("lastName")).sendKeys(Last_name);
		        	driver.findElement(By.name("phone")).sendKeys(Phone);
		        	driver.findElement(By.name("userName")).sendKeys(Email);
		        	driver.findElement(By.name("address1")).sendKeys(Address);
		        	driver.findElement(By.name("city")).sendKeys(City);
		        	driver.findElement(By.name("state")).sendKeys(State);
		        	driver.findElement(By.name("postalCode")).sendKeys(Post_Code);
		        	
		        	Thread.sleep(2000);
		      Select dropcountry=  new Select(driver.findElement(By.name("country")));
		      dropcountry.selectByVisibleText(Country);
		      
		           driver.findElement(By.name("email")).sendKeys(UserName);
		           driver.findElement(By.name("password")).sendKeys(PassWord);
		           driver.findElement(By.name("confirmPassword")).sendKeys(Confarm_PassWord);
		           
		           driver.findElement(By.name("submit")).click();
		           
		           if (driver.getPageSource().contains(null)) {
		        	   System.out.println("Resitration Done for :" +i + "Record");
		           } else
		           {
		        	   System.out.println("Registration Faild for " +i + "Record");
		           }
		    		  
		           driver.findElement(By.name("firstName")).clear();
		        	driver.findElement(By.name("lastName")).clear();
		        	driver.findElement(By.name("phone")).clear();
		        	driver.findElement(By.name("userName")).clear();
		        	driver.findElement(By.name("address1")).clear();
		        	driver.findElement(By.name("city")).clear();
		        	driver.findElement(By.name("state")).clear();
		        	driver.findElement(By.name("postalCode")).clear();
		        	driver.findElement(By.name("country")).clear();
		     	        			      		      
		           driver.findElement(By.name("email")).clear();
		           driver.findElement(By.name("password")).clear();
		           driver.findElement(By.name("confirmPassword")).clear();
		        	
		        	
		        	
		        	
		        }
				
				
				

			
		
	}

}
