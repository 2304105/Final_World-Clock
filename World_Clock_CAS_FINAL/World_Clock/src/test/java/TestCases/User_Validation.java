package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.Be_Cognizant;

public class User_Validation extends BaseClass {
	static Be_Cognizant b_cog ;
	
	@Test(priority = 1)
	public void user() throws InterruptedException {
		b_cog=new Be_Cognizant(driver);
		b_cog.clickOnUserIcon();
		Thread.sleep(3000);
		 logger.info("-----2 test case for --------");
		  logger.info("user validation sucess");
		BaseClass.screenshot("userProfile");
		b_cog.clickbackuser();
		WebElement around_Cogni=driver.findElement(By.xpath("//*[@id='5d7d4eec-cbe0-4c55-ae2e-f38d926d82a0']/div/div/div/p/span/strong"));
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView();",around_Cogni);
		WebElement seeAll=driver.findElement(By.xpath("//*[@id=\"c24ff0ed-b166-42e5-b7d5-57c9a9e573cb\"]/div/div/div/p/a/span/strong"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",seeAll);
		Thread.sleep(4000);
	}

}
