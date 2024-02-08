/*
 * Case Study: Search For Schools
 * Problem Statement:Find school details in Eduvidya application.
 * 
 * Suggested site: https://www.eduvidya.com/
 * Detailed Description:
 	Open the browser
	Enter the url https://www.eduvidya.com/
	Click on "Schools" link in the Menu bar
	Click on "Course-Type" dropdown and select “CBSE” from the list
	Click on "City" dropdown and select “Pune” from the list
	Click on "Search" button
	Verify Search results is displayed or not
	Close the browser
 */
//
//
//
package testminiproject;
// 

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.zone.ZoneRules;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
// 
public class MiniProject {
//	
	public static WebDriver driver;
	public static List<WebElement> scList;
	
	public WebDriver driver() {
		driver = DriverSetup.getWebdriver();
		return driver;
//
	}
//	
	public void loadPage() { 
//		driver.findElement(By.id("details-button")).click(); 
//		driver.findElement(By.id("proceed-link")).click();
//		ScreenShot.takeScreenShot(driver, "Load.png");
    
//		
//		long now = System.currentTimeMillis();
//	    long diff = TimeZone.getTimeZone("IST").getOffset(now) - TimeZone.getTimeZone("EST").getOffset(now); 
//	    System.out.println(diff);
//	    TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
//		SimpleDateFormat time1 = new SimpleDateFormat("h");
//		SimpleDateFormat time2 = new SimpleDateFormat("mm");
//
//		Date time_ = new Date();
//		String time_lon = time1.format(time_);
//		String time_lon2 = time2.format(time_);
//		String t = time_lon+"h"+" "+time_lon2+"m";
////		System.out.println(wc.checklontime());
//		System.out.println(t);
//		
//		TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
//		SimpleDateFormat time_1 = new SimpleDateFormat("h");
//		SimpleDateFormat time_2 = new SimpleDateFormat("mm");
//
//		Date time = new Date();
//		String time_ny = time_1.format(time);
//		String time_ny2 = time_2.format(time);
//		String ti = time_ny+"h"+" "+time_ny2+"m"+" "+"behind";
////		System.out.println(wc.checklontime());
//		System.out.println(ti);
		
//		ZoneId londonTime = ZoneId.of("Europe/London");
//		ZoneId NYTime = ZoneId.of("Asia/Kolkata");
//		
//		ZonedDateTime lon_time = ZonedDateTime.now(londonTime);
//		ZonedDateTime NY_time = ZonedDateTime.now(NYTime);
//		
//		
//		long timezonegaps = ChronoUnit.HOURS.between(lon_time,NY_time);
//		
//		System.out.println(timezonegaps);
		
//		ZoneOffset londonOffset = ZoneOffset.ofHours(0);  // London is in UTC or GMT
//        ZoneOffset newYorkOffset = ZoneOffset.ofHours(-5); // New York is 5 hours behind UTC
// 
//        OffsetDateTime londonTime = OffsetDateTime.now(londonOffset);
//        OffsetDateTime newYorkTime = OffsetDateTime.now(newYorkOffset);
// 
//        long hoursGap = newYorkOffset.get(ChronoField.OFFSET_SECONDS) / 3600;
// 
//        System.out.println("Timezone gap between London and New York: " + hoursGap + " hours");
		
//		ZoneId londonZone = ZoneId.of("Europe/London");
//        ZoneId newYorkZone = ZoneId.of("America/New_York");
// 
//        ZonedDateTime londonTime = ZonedDateTime.now(londonZone);
//        ZonedDateTime newYorkTime = ZonedDateTime.now(newYorkZone);
// 
//        Duration timeDifference = Duration.between(londonTime, newYorkTime);
// 
//        System.out.println("Time difference between London and New York: " + timeDifference.toHours() + " hours");
		
//        ZoneId londonZone = ZoneId.of("Europe/London");
//        ZoneId newYorkZone = ZoneId.of("America/New_York");
// 
//        ZoneOffset londonOffset = ZoneOffset.from(londonZone);
//        ZoneOffset newYorkOffset = ZoneOffset.from(newYorkZone);
// 
//        int hoursDifference = newYorkOffset.getTotalSeconds() / 3600 - londonOffset.getTotalSeconds() / 3600;
// 
//        System.out.println("Time difference between London and New York: " + hoursDifference + " hours");
		
//		TimeZone bangloreTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
//        TimeZone newYorkTimeZone = TimeZone.getTimeZone("Europe/London");
// 
//        int hoursDifference = (bangloreTimeZone.getRawOffset()-newYorkTimeZone.getRawOffset()) / (60 * 60 * 1000);
//        int minutesDifference = (bangloreTimeZone.getRawOffset()-newYorkTimeZone.getRawOffset()) / (60 * 1000) % 60;
//        System.out.println("Time difference between Banglore and London : " + hoursDifference + " hours " + minutesDifference + " minutes");
        
        
//        TimeZone bangloreTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
//        TimeZone newYorkTimeZone = TimeZone.getTimeZone("Europe/London");
// 
//        int hoursDifference = (bangloreTimeZone.getRawOffset()-newYorkTimeZone.getRawOffset()) / (60 * 60 * 1000);
//        int minutesDifference = (bangloreTimeZone.getRawOffset()-newYorkTimeZone.getRawOffset()) / (60 * 1000) % 60;
//        String lonbanggap = hoursDifference + "h " + minutesDifference + "m "+"behind";
//		System.out.println(lonbanggap);
//		
//		WebElement india_loc = driver.findElement(By.xpath("//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]"));
//		String s = india_loc.getText();
	
//		System.out.println(s);
		
		TimeZone bangloreTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
        TimeZone newYorkTimeZone = TimeZone.getTimeZone("America/New_York");
 
        int hoursDifference = (bangloreTimeZone.getRawOffset()-newYorkTimeZone.getRawOffset()) / (60 * 60 * 1000);
        int minutesDifference = (bangloreTimeZone.getRawOffset()-newYorkTimeZone.getRawOffset()) / (60 * 1000) % 60;
        String NYbanggap = hoursDifference + "h " + minutesDifference + "m "+"behind";
		System.out.println(NYbanggap);
		
		
	}
//		driver.get("https://www.timeanddate.com/worldclock/uk/london");
//		String l_time = driver.findElement(By.id("ct")).getText();
////		SimpleDateFormat timeformat=new SimpleDateFormat("h:mm");
////		String formatedtime=timeformat.format(l_time); 
//		System.out.println(l_time);
		
//		Date currentTime = new Date();
//		SimpleDateFormat timeformat=new SimpleDateFormat("hh:mm");
//		String formatedtime=timeformat.format(currentTime); 
//		System.out.println(formatedtime);

	

//	public void selectSchool() {
//		
//		driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[4]/a")).click();
//		ScreenShot.takeScreenShot(driver, "selectsch.png");
//
//	}
//	public void select() {
//		
////		Select Board
//		
//		WebElement all = driver.findElement(By.xpath("//*[@id=\"ddl_Category\"]"));
//		all.click();
//		Select droppattern = new Select(all);
//		droppattern.selectByVisibleText("CBSE");
//		ScreenShot.takeScreenShot(driver,"selectboard.png");
//		
////		Select City
//		
//		WebElement city = driver.findElement(By.xpath("//*[@id=\"ddl_City\"]"));
//		city.click();
//		Select dropcity = new Select(city);
//		dropcity.selectByVisibleText("Pune");
//		ScreenShot.takeScreenShot(driver,"selectcity.png");
//	}
//	
//	public  void search() {
//		
//		driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();
//		ScreenShot.takeScreenShot(driver,"search.png");
//		
//
//	}
//	
//	public void verifyResult() {
//		boolean list = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[3]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/ul/li[1]/div[2]/a")).isDisplayed();
//		if(list) {
//			System.out.println("Result is displayed");
//		}
//		else {
//			System.out.println("Result is not displayed");
//		}
//
//		
//		System.out.println();
//		
//		
//	}
//	
//	public List<WebElement> schoolList(){
//		
//		scList = driver.findElements(By.xpath("//*[@class=\"rec_links\"]"));
//		ExcelUtility.dataToExcel(scList);
//		for(WebElement sl : scList) {
//			System.out.println(sl.getText());
//		}
//		ScreenShot.takeScreenShot(driver,"schoollist.png");
//		return scList;
//		
//	}
//	
	public void close() {
		driver.quit();
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiniProject mn = new MiniProject();
		
//		mn.driver();
		mn.loadPage();
//		mn.selectSchool();
//		mn.select();
//		mn.search();
//		mn.verifyResult();
//		mn.schoolList();
//		mn.close();
		
	
		


}  

	}





		


		

		

		
		
