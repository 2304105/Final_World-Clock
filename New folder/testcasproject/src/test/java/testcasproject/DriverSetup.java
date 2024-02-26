package testcasproject;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class DriverSetup {

	public static WebDriver driver;
	public static String exepath;
	public static String browserType;
	
	public static WebDriver getWebDriver(String browser) {
//		  System.out.println("Enter the Browser name : ");
//		  Scanner sc = new Scanner(System.in);
//		  browser = sc.nextLine();
		  browserType=browser;
		  if(browserType.equalsIgnoreCase("edge")) {
			  driver=new EdgeDriver();
		  }
		  else if(browserType.equalsIgnoreCase("chrome")){
			  driver=new ChromeDriver();
		  }
//		  sc.close();
		  return driver;
	}
	
	public static void closeDriver() {
		driver.close();
}
}
