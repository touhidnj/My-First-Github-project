package dATADriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reg_Excel {

	public static void main(String[] args) throws IOException {

		FileInputStream file= new FileInputStream("D:\\selenium\\aDRegis.xlsx");
		   
		   // Create Work Book variable for Excel file by Apache XSSFWorkbook class. When we import this class we can see under the package
		   //import org.apache.poi.xssf.usermodel.XSSFWorkbook. All apache classes are under the same usermodel packge. If we put there * it will not ask anymore for other classes.
		   
		   XSSFWorkbook workbook = new XSSFWorkbook(file);
		   
		   // To get the Excel sheet we need to create an object and call the shet by getSheet() Method
		   // We can do Two way :
		   
		   XSSFSheet sheet=workbook.getSheet("Sheet1");          // will provied Sheet by name
		   //XSSFSheet sheet = workbook.getSheetAt(0);             // Will provied Sheet By index
		   
		       int rowcount= sheet.getLastRowNum();      // This is the Method
		        int cellcount= sheet.getRow(0).getLastCellNum();
		        
		        
		        for (int i=0;  i<rowcount; i++) {
		        	
		        	XSSFRow currentrow= sheet.getRow(i);
		        	
		        	for (int j=0; j<cellcount; j++) {
		        		
		        		String value= currentrow.getCell(j).toString();
		        		System.out.print(   "               "                  +value);
		        	}
		        	System.out.println();
		        }
				
				
				

		
	}

}
