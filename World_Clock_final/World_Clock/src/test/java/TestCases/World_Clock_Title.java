package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.Be_Cognizant;

public class World_Clock_Title extends BaseClass {
	static Be_Cognizant b_cog;
	
	@Test(priority = 2)
	public void Test_WorldClock_Title() {
		b_cog=new Be_Cognizant (driver);
		System.out.println(b_cog.checkclockbox().toLowerCase());
		Assert.assertEquals(b_cog.checkclockbox().toLowerCase(), "world clock");
		logger.info("*****Second Test case*****");
		logger.info("World Clock Title validation successfully.....☑️");
		BaseClass.screenshot("worldclock");
	}
}
