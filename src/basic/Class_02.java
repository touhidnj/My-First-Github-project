package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Class_02 {

	// using MsEdge driver 
	//Not Working 
	
	public static void main(String[] args) {

		System.setProperty("webdriver.Msedge.driver", "\"C:\\Users\\Ashik Islam\\Downloads\\edgedriver_win64\\msedgedriver.exe\"");
		WebDriver driver=new EdgeDriver();
				
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		
	}

}
