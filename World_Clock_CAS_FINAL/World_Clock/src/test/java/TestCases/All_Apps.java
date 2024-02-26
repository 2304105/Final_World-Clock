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
	public void scroll() {
		WebElement appAndTool=driver.findElement(By.xpath("//*[@id='5d7d4eec-cbe0-4c55-ae2e-f38d926d82a0']/div/div/div/p/span/strong"));
				JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView();",appAndTool);
		logger.info("-----15 test case for --------");
		  logger.info("scroll back to one cognizant sucess");
		BaseClass.screenshot("onecogni");
	}
	@Test(priority=15)	
	public void Viewapps() throws InterruptedException {
		//view all apps
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
			logger.info("-----16 test case for --------");
			  logger.info("all hot apps displayed sucess");
			o_cog.hotapps2();
	}
}
