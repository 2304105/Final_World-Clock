package TestCases;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.Be_Cognizant;

public class Banglore_info extends BaseClass {
static Be_Cognizant b_cog ;
	
	@Test(priority = 3)
	void BangaloreWatch_Title() {
		b_cog=new Be_Cognizant (driver);
		logger.info("*****Third Test Case*****");
		System.out.println(b_cog.checkindiaclock());
		Assert.assertEquals(b_cog.checkindiaclock().toLowerCase(), "bangalore, india (ist)");
		logger.info("Banglore Title Validation Completed.....☑️");
	}

	@Test(priority = 4)
	public void Bangalore_Time() {
		b_cog=new Be_Cognizant (driver);
		logger.info("*****Fourth Test Case*****");
		Date currentTime = new Date();
		SimpleDateFormat timeformat=new SimpleDateFormat("h:mma");
		String formatedtime=timeformat.format(currentTime); 
		System.out.println(formatedtime.toLowerCase());
		String webtime = b_cog.checkindiatime();
		System.out.println(webtime.toLowerCase());
		Assert.assertEquals(webtime.toLowerCase(), formatedtime.toLowerCase());
		logger.info("Banglore Time Validation Completed.....☑️");
	}

	@Test(priority = 5)
	public void Bangalore_Date() {
		b_cog=new Be_Cognizant (driver);
		logger.info("*****Fifth Test Case*****");
		LocalDate currentSysDate=LocalDate.now();
		DateTimeFormatter date_formatter=DateTimeFormatter.ofPattern("EEEE, M/d/yyyy");
		String formattedDate=currentSysDate.format(date_formatter);
		System.out.println(formattedDate.toLowerCase());
		String webdate=b_cog.chechindiadate();
		System.out.println(webdate.toLowerCase());
		Assert.assertEquals(webdate.toLowerCase(), formattedDate.toLowerCase());
		logger.info("Banglore Date Validation Successfully.....☑️");	
	}
	

}