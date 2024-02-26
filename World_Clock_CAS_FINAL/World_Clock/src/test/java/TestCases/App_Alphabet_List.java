package TestCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import Utilities.ExcelUtility;
import pageObjects.One_Cognizant;

public class App_Alphabet_List extends BaseClass{
	static One_Cognizant o_cog;

	@Test(priority=16)
	public void Appsalphabet() {   
		    //disabled alphabet
		o_cog=new One_Cognizant(driver);
			List<String> str= new ArrayList<String>();
			for(WebElement e:o_cog.ele3) {
				if(e.getAttribute("role")!=null) {
					continue;
				}
				else
					str.add(e.getText());
			}
			for(String s: str)
			System.out.println(s+" is disabled");
			logger.info("-----17 test case for --------");
			  logger.info(" X is Disabled");
		}
	@Test(priority=17)
	void Randomalphabet() throws InterruptedException, IOException {
		o_cog=new One_Cognizant(driver);
		logger.info("*****Seventeenth Test Case*****"+browser);
		Random rand=new Random();
		List<WebElement> li = o_cog.ele3;
		while(true) {
		int n=rand.nextInt(li.size());
		if(li.get(n).equals("X"))
			continue;
		li.get(n).click();
		Thread.sleep(5000);
		BaseClass.screenshot("randomclick");
		break;
		}
		o_cog.apps();
		ExcelUtility.exceldata(o_cog.apps());
		logger.info("Random Alphabet Validation Completed.....☑️");
	}
	
	@AfterTest
	void close() {
		driver.quit();
	}
}

