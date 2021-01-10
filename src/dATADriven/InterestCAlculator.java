package dATADriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InterestCAlculator {

	

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Files\\\\Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-mysore/fixed-deposit-calculator-SBM-BSB007.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor page=(JavascriptExecutor)driver;      
		page.executeScript("scroll(0, 300);");
	Thread.sleep(2000);
							
		FileInputStream file= new FileInputStream("D:\\selenium\\CalData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);		   
		XSSFSheet sheet=workbook.getSheet("Sheet1");          
		
		int rowcount= sheet.getLastRowNum();
		
		for (int i=1; i<= rowcount; i++) {
			
			 XSSFRow  row= sheet.getRow(i); 
			 
			 XSSFCell principalcell= row.getCell(0);
			 int principal=(int) principalcell.getNumericCellValue();
			 
			// int principalcell= (int) row.getCell(0).getNumericCellValue();
			 
			 XSSFCell rateint= row.getCell(1);
			 int rate = (int) rateint.getNumericCellValue();
			 
			 XSSFCell period=row.getCell(2);
			 int perio=(int) period.getNumericCellValue();
			 
			 XSSFCell frequency= row.getCell(3);
			 String freq= frequency.getStringCellValue();
			 
			 XSSFCell Matuvalue=row.getCell(4);
			 int Ex_mvalue=(int) Matuvalue.getNumericCellValue();
			 
			 
			 driver.findElement(By.id("principal")).sendKeys(String.valueOf(principal));
			 
			 driver.findElement(By.id("interest")).sendKeys(String.valueOf(rate));
			 
			 driver.findElement(By.id("tenure")).sendKeys(String.valueOf(perio));
			 
			 
			 Select preoddrop=new Select (driver.findElement(By.id("tenurePeriod")));
			 preoddrop.selectByVisibleText("year(s)");
			 
			 Select frequencydrop=new Select (driver.findElement(By.id("frequency")));
			 frequencydrop.selectByVisibleText("Simple Interest");   //
			 
			 driver.findElement(By.xpath("//body/div[@id='mc_mainWrapper']/div[2]/div[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[2]/a[1]/img[1]")).click();
			 
			String actual_mvalue= driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
			
			if ((Double.parseDouble(actual_mvalue))==Ex_mvalue) {
				System.out.println("Finaly your TEST PASSED");
				
			} else {
				
				System.out.println("You dump TEST FAILED");
			}
			 
			 driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();	 		
			 
			 Thread.sleep(2000);
			 
		}
		  
		   
		
		
			
		
	}

}
