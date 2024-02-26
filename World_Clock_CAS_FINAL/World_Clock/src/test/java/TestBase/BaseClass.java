package TestBase;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseClass {
	public static WebDriver driver;
	public static String exepath;
	public static String browserType;
	public static String browser;
	public static Logger logger;
	
	@BeforeTest
	@Parameters("browser")
	public  WebDriver getWebDriver(String browser) {
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
		  logger.info("-----1 test case for -"+browser+"-------");
		  logger.info("browser opens sucess");
		return driver;

	}
	public static String screenshot(String name) throws IOException {
		TakesScreenshot ss = ((TakesScreenshot) driver);
		File src=ss.getScreenshotAs(OutputType.FILE);
	
			String trgpath = System.getProperty("user.dir")+ "./Reports/Screenshot/"+name+".png";
			File trg=new File(trgpath);
			FileUtils.copyFile(src, trg);
			return trgpath;
	}
	

}