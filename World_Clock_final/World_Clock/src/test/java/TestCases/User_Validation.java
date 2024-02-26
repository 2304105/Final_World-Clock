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
		logger.info("*****First Test Case*****");
		b_cog.clickOnUserIcon();
		
		Thread.sleep(5000);
		BaseClass.screenshot("userProfile");
		b_cog.clickbackuser();
		
		logger.info("User Validation Completed.....☑️");
		
		WebElement appAndTool=driver.findElement(By.xpath("//*[text()=\"Around Cognizant\"]"));
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView();",appAndTool);
		Thread.sleep(2000);
		
		WebElement seeAll=driver.findElement(By.xpath("//*[@id=\"c24ff0ed-b166-42e5-b7d5-57c9a9e573cb\"]/div/div/div/p/a/span/strong"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",seeAll);
	}

}
