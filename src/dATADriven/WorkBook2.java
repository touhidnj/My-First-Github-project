package dATADriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkBook2 {

	public static void main(String[] args) throws IOException {
		

		   FileInputStream file= new FileInputStream("D:\\selenium\\Selenium need to done.xlsx");
		   
		   XSSFWorkbook workbook = new XSSFWorkbook(file);
		   
		   XSSFSheet sheet=workbook.getSheet("Sheet1");   // will provied Sheet by name
		   //XSSFSheet sheet = workbook.getSheetAt(0);             // Will provied Sheet By index
		   
		       int rowcount= sheet.getLastRowNum();      // This is the Method
		        int cellcount= sheet.getRow(0).getLastCellNum();
		        
		        
		        for (int i=0;  i<rowcount; i++) {
		        	
		        	XSSFRow currentrow= sheet.getRow(i);
		        	
		        	for (int j=0; j<cellcount; j++) {
		        		
		        		String value1= currentrow.getCell(j).toString();
		        		System.out.print(   "         "                  +value1);
		        	}
		        	System.out.println();
		        }
				

		
		
		
		
		
		
		
		
		
		
	}

}
