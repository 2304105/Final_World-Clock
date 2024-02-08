package testcasproject;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class Testclock {

	public static WebDriver driver;
	public static String url="https://be.cognizant.com/";
	public static String browser="chrome";
	public static POMClock wc;

	@BeforeClass
	void openpage(){
		driver=DriverSetup.getWebDriver(browser);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		WebElement seeAll=driver.findElement(By.xpath("//*[@id=\"c24ff0ed-b166-42e5-b7d5-57c9a9e573cb\"]/div/div/div/p/a/span/strong"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",seeAll);
	}


	@Test(priority = 1)
	public static void Test_WorldClock_Title() {
		wc=new POMClock(driver);
		Assert.assertEquals(wc.checkclockbox(), true);
	}

	//India time
	@Test(priority = 2)
	void BangaloreWatch_Title() {
		wc=new POMClock(driver);
		Assert.assertEquals(wc.checkindiaclock(), true);
//		
	}

	@Test(priority = 3)
	public static void Bangalore_Time() {
		Date currentTime = new Date();
		SimpleDateFormat timeformat=new SimpleDateFormat("h:mm");
		String formatedtime=timeformat.format(currentTime); 
		wc=new POMClock(driver);
		System.out.println(wc.checkindiatime());
		System.out.println(formatedtime);
		Assert.assertEquals(formatedtime,wc.checkindiatime());
	}

	@Test(priority = 4)
	public static void Bangalore_Date() {
		LocalDate currentSysDate=LocalDate.now();
		DateTimeFormatter date_formatter=DateTimeFormatter.ofPattern("EEEE, M/d/yyyy");
		String formattedDate=currentSysDate.format(date_formatter);
		System.out.println(formattedDate);
		Assert.assertEquals(wc.chechindiadate(), formattedDate);
	
	}

	//london test
	@Test(priority = 5)
	void LondonWatch_Tittle() {
		
		wc=new POMClock(driver);
		Assert.assertEquals(wc.checklonclock(), true);

	}

	@Test(priority = 6)

	void London_Time() {
		
		wc=new POMClock(driver);
		TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
		SimpleDateFormat time = new SimpleDateFormat("h:mm");
		Date time_ = new Date();
		String time_lon = time.format(time_);
		System.out.println(wc.checklontime());
		System.out.println(time_lon);
		Assert.assertEquals(time_lon,wc.checklontime());	
		
	}

	@Test(priority = 7)

	void London_Date() {
		TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
		SimpleDateFormat date = new SimpleDateFormat("EEEE, M/d/yyyy");
		Date date_ = new Date();
		String date_lon = date.format(date_);
		System.out.println(wc.checklondate());
		System.out.println(date_lon);
		Assert.assertEquals(date_lon,wc.checklondate());	
	}

	@Test(priority = 8)

	void London_Timegap() {
		
		TimeZone bangloreTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
        TimeZone LondonTimeZone = TimeZone.getTimeZone("Europe/London");
 
        int hoursDifference = (bangloreTimeZone.getRawOffset()-LondonTimeZone.getRawOffset()) / (60 * 60 * 1000);
        int minutesDifference = (bangloreTimeZone.getRawOffset()-LondonTimeZone.getRawOffset()) / (60 * 1000) % 60;
        String lonbanggap = hoursDifference + "h " + minutesDifference + "m "+"behind";
		System.out.println(lonbanggap);
		System.out.println(wc.checklongaptime());
		Assert.assertEquals(lonbanggap, wc.checklongaptime());
		
	}
	//NY Test
	@Test (priority = 9)
	void NY_Watchtittle() {
		wc=new POMClock(driver);
		Assert.assertEquals(wc.nyclock(), true);

	}

	@Test(priority = 10)

	void NY_Time() {
		
		wc=new POMClock(driver);

		TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
		SimpleDateFormat time = new SimpleDateFormat("h:mm");
		Date time_ = new Date();
		String time_NY = time.format(time_);
		System.out.println(wc.checknytime());
		System.out.println(time_NY);
		Assert.assertEquals(time_NY,wc.checknytime());
		
	}

	@Test (priority = 11)

	void NY_Date() {
		TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
		SimpleDateFormat date = new SimpleDateFormat("EEEE, M/d/yyyy");
		Date date_ = new Date();
		String date_NY = date.format(date_);
		System.out.println(wc.checknydate());
		System.out.println(date_NY);
		Assert.assertEquals(date_NY,wc.checknydate());	
	}

	@Test (priority = 12)
	void NY_Timegap() {
		TimeZone bangloreTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
        TimeZone newYorkTimeZone = TimeZone.getTimeZone("America/New_York");
 
        int hoursDifference = (bangloreTimeZone.getRawOffset()-newYorkTimeZone.getRawOffset()) / (60 * 60 * 1000);
        int minutesDifference = (bangloreTimeZone.getRawOffset()-newYorkTimeZone.getRawOffset()) / (60 * 1000) % 60;
        String NYbanggap = hoursDifference + "h " + minutesDifference + "m "+"behind";
		System.out.println(NYbanggap);
		System.out.println(wc.checknyindiagaptime());
		Assert.assertEquals(NYbanggap, wc.checknyindiagaptime());
	}


	//close browser

	

	@AfterClass

	void close() {

		driver.close();
}
}
