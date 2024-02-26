package TestCases;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.Be_Cognizant;

public class London_info extends BaseClass {
	static Be_Cognizant b_cog ;

	@Test(priority = 6)

	void LondonWatch_Tittle() {
		b_cog=new Be_Cognizant (driver);
		logger.info("*****Sixth Test Case*****");
		Assert.assertEquals(b_cog.checklonclock().toLowerCase(), "london, uk (bst)");
		logger.info("London Title Validation Completed.....☑️");
	}

	@Test(priority = 7)
	void London_Time() {
		b_cog=new Be_Cognizant (driver);
		TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
		SimpleDateFormat time = new SimpleDateFormat("h:mm");
		Date time_ = new Date();
		String time_lon = time.format(time_);
		System.out.println(b_cog.checklontime());
		System.out.println(time_lon);
		Assert.assertEquals(time_lon,b_cog.checklontime());
		logger.info("London Time Validation Completed.....☑️");
	}

	@Test(priority = 8)

	void London_Date() {
		b_cog=new Be_Cognizant (driver);
		logger.info("*****Eighth Test Case*****");	
		TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
		SimpleDateFormat date = new SimpleDateFormat("EEEE, M/d/yyyy");
		Date date_ = new Date();
		String date_lon = date.format(date_);
		System.out.println(b_cog.checklondate());
		System.out.println(date_lon);
		Assert.assertEquals(date_lon,b_cog.checklondate());
		logger.info("London Date Validation Completed.....☑️");	
	}

	@Test(priority = 9)

	void London_Timegap() {
		b_cog=new Be_Cognizant (driver);
		logger.info("*****Nineth Test Case*****");		
		TimeZone bangloreTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
		TimeZone LondonTimeZone = TimeZone.getTimeZone("Europe/London");
        int hoursDifference = (bangloreTimeZone.getRawOffset()-LondonTimeZone.getRawOffset()) / (60 * 60 * 1000);
        int minutesDifference = (bangloreTimeZone.getRawOffset()-LondonTimeZone.getRawOffset()) / (60 * 1000) % 60;
        String lonbanggap = hoursDifference + "h " + minutesDifference + "m "+"behind";
		System.out.println(lonbanggap);
		System.out.println(b_cog.checklongaptime());
		Assert.assertEquals(lonbanggap, b_cog.checklongaptime());
		logger.info("Timegap between Banglore and London Validation Completed.....☑️");	

		        
	}


}
