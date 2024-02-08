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
	
	@Test (priority = 9)
	void NY_Watchtittle() {
		b_cog=new Be_Cognizant (driver);
		Assert.assertEquals(b_cog.nyclock().toLowerCase(), "new york, ny (est)");
	}

	@Test(priority = 10)
	void NY_Time() {
		b_cog=new Be_Cognizant (driver);
		
		TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
		SimpleDateFormat time = new SimpleDateFormat("h:mm");
		Date time_ = new Date();
		String time_NY = time.format(time_);
		System.out.println(b_cog.checknytime());
		System.out.println(time_NY);
		Assert.assertEquals(time_NY,b_cog.checknytime());
		
	}

	@Test (priority = 11)
	void NY_Date() {
		b_cog=new Be_Cognizant (driver);
		
		TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
		SimpleDateFormat date = new SimpleDateFormat("EEEE, M/d/yyyy");
		Date date_ = new Date();
		String date_NY = date.format(date_);
		System.out.println(b_cog.checknydate());
		System.out.println(date_NY);
		Assert.assertEquals(date_NY,b_cog.checknydate());
	}

	@Test (priority = 12)

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
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));			
	}



}