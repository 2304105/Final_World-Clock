package testminiproject;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
	
	public static WebDriver driver;

	@BeforeSuite
	public static WebDriver getWebdriver() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Browser name : ");
		
		Scanner sc = new Scanner(System.in);
		
		String browser = sc.nextLine();
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Invalid Browser");
		}
		
		driver.get("https://www.eduvidya.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;

	}

}
