package TestBase;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;
	public static String exepath;
	public static String browserType;
	public static String browser="Chrome";
	public static Logger logger;
	
	@BeforeSuite
	public WebDriver getWebDriver() {
		logger = LogManager.getLogger(this.getClass());
		  browserType=browser;
		  if(browserType.equalsIgnoreCase("edge")) {
			  driver=new EdgeDriver();
		  }
		  else if(browserType.equalsIgnoreCase("chrome")){
			  driver=new ChromeDriver();
		  }
		  driver.get("https://be.cognizant.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().deleteAllCookies();
		return driver;

	}
	public static void screenshot(String name) {
		TakesScreenshot ss = ((TakesScreenshot) driver);
				File src=ss.getScreenshotAs(OutputType.FILE);
		try {
			File trg=new File("./Screenshot/"+name+".png");
			FileUtils.copyFile(src, trg);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	

}