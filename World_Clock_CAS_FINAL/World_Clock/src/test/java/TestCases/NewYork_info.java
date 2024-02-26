package TestCases;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.Be_Cognizant;

public class NewYork_info extends BaseClass {
	static Be_Cognizant b_cog ;
	
	@Test (priority = 10)
	void NY_Watchtittle() {
		b_cog=new Be_Cognizant (driver);
		Assert.assertEquals(b_cog.nyclock().toLowerCase(), "new york, ny (est)");
		logger.info("-----11 test case for --------");
		  logger.info("newyork tittle  sucess");
	}

	@Test(priority = 11)
	void NY_Time() {
		b_cog=new Be_Cognizant (driver);
		
		TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
		SimpleDateFormat time = new SimpleDateFormat("h:mm");
		Date time_ = new Date();
		String time_NY = time.format(time_);
		System.out.println(b_cog.checknytime());
		System.out.println(time_NY);
		Assert.assertEquals(time_NY,b_cog.checknytime());
		logger.info("-----12 test case for --------");
		  logger.info("newyork time validation  sucess");
	}

	@Test (priority = 12)
	void NY_Date() {
		b_cog=new Be_Cognizant (driver);
		
		TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
		SimpleDateFormat date = new SimpleDateFormat("EEEE, M/d/yyyy");
		Date date_ = new Date();
		String date_NY = date.format(date_);
		System.out.println(b_cog.checknydate());
		System.out.println(date_NY);
		Assert.assertEquals(date_NY,b_cog.checknydate());
		logger.info("-----13 test case for --------");
		  logger.info("newyork date validation sucess");
	}

	@Test (priority = 13)

	void NY_Timegap() {
		b_cog=new Be_Cognizant (driver);
		
		TimeZone bangloreTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
        TimeZone newYorkTimeZone = TimeZone.getTimeZone("America/New_York");
        int hoursDifference = (bangloreTimeZone.getRawOffset()-newYorkTimeZone.getRawOffset()) / (60 * 60 * 1000);
        int minutesDifference = (bangloreTimeZone.getRawOffset()-newYorkTimeZone.getRawOffset()) / (60 * 1000) % 60;
        String NYbanggap = hoursDifference + "h " + minutesDifference + "m "+"behind";
		System.out.println(NYbanggap);	
		System.out.println(b_cog.checknyindiagaptime());
		Assert.assertEquals(NYbanggap, b_cog.checknyindiagaptime());
		logger.info("-----14 test case for --------");
		  logger.info("newyork time gap validation  sucess");
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));			
	}



}
