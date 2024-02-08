package TestCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.One_Cognizant;

public class App_Alphabet_List extends BaseClass{
	static One_Cognizant o_cog;

	@Test(priority=15)
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
 
		}
	@Test(priority=16)
	void Randomalphabet() {
		o_cog=new One_Cognizant(driver);
		Random rand=new Random();
		List<WebElement> li = o_cog.ele3;
		while(true) {
		int n=rand.nextInt(li.size());
		if(li.get(n).equals("X"))
			continue;
		li.get(n).click();
		break;
		}
	}
	
	@AfterSuite
	void close() {
		driver.quit();
	}
}

