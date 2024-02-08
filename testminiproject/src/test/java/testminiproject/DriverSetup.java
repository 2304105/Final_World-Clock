package testminiproject;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetup {
	
	private static WebDriver driver;

	public static WebDriver getWebdriver() {
//		System.out.println("Enter the Browser name : ");
////		
//		Scanner sc = new Scanner(System.in);
//		
//		String browser = sc.nextLine();
//		
//		if(browser.equalsIgnoreCase("Chrome")) {
//		}
//		else if(browser.equalsIgnoreCase("Edge")) {
//			driver = new EdgeDriver();
//		}
//		else {
//			System.out.println("Invalid Browser");
		
	
		
		driver = new ChromeDriver();
		driver.get("https://be.cognizant.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;

	}

}

