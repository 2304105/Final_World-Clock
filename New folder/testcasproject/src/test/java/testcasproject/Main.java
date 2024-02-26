package testcasproject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Main {





		
		public static WebDriver driver;
		public static String url="https://be.cognizant.com/";
		public static String browser="chrome";
		public static List<WebElement> a_out;
		public static POMClock wc;


		
		
		public static void launch() {
			driver=DriverSetup.getWebDriver(browser);
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().deleteAllCookies();
		}
		

		
		
		
		public static void verifyIndiaTime() {
			Date currentTime = new Date();
			SimpleDateFormat timeformat=new SimpleDateFormat("hh:mm");
			String formatedtime=timeformat.format(currentTime); 
			System.out.println(formatedtime);
			
			LocalDate currentSysDate=LocalDate.now();
			DateTimeFormatter date_formatter=DateTimeFormatter.ofPattern("EEEE, M/d/yyyy");
			String formattedDate=currentSysDate.format(date_formatter);
			System.out.println(formattedDate);
		}
		
		public static void verifyLondonTime() {
			
		}

		public static void verifyNewYorkTime() {
		
		}
		
		public static void verifyApp() {
			
		}
		

		
		public static void takeScreenShot() {
			TakesScreenshot ss = (TakesScreenshot) driver;
			File src=ss.getScreenshotAs(OutputType.FILE);
			try {
				File trg=new File("./testcase/Screenshot/image1.png");
				FileUtils.copyFile(src, trg);
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
				}
		}
		
		
		public static void closeBrowser() {
			DriverSetup.closeDriver();	}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Main mn = new Main();
			mn.launch();
			
			Main.closeBrowser();

	}

}
