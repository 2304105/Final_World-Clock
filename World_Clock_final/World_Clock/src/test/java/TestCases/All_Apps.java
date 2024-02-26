package TestCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.One_Cognizant;

public class All_Apps extends BaseClass {
	static One_Cognizant o_cog;

	
	@Test(priority=14)
	public void scroll() throws InterruptedException {
		logger.info("*****Fourteenth Test Case*****");

		WebElement appAndTool=driver.findElement(By.xpath("//*[text()=\"Around Cognizant\"]"));
				JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView();",appAndTool);
		BaseClass.screenshot("onecogni");
		logger.info("------Successfully Scroll Down------");
		Thread.sleep(5000);
	}
	@Test(priority=15)	
	public void Viewapps() throws InterruptedException {
		//view all apps
		logger.info("*****Fifteenth Test Case*****");

		o_cog=new One_Cognizant(driver);
		o_cog.onecognizant();
		Set<String> windowid = driver.getWindowHandles();
		List<String> windowsidList = new ArrayList<String> (windowid);
		for (int i =0;i<windowsidList.size();i++) {
			String title=driver.switchTo().window(windowsidList.get(i)).getTitle();
			if (title.equals("OneCognizant")) {
				break;
			}
		}
			//one.Quickaccess();
			o_cog.hotapps();
			Thread.sleep(2000);
			BaseClass.screenshot("hotsapps");
			o_cog.hotapps2();
			logger.info("Switch to OneCognizant Validation Completed.....☑️");
	}
}
