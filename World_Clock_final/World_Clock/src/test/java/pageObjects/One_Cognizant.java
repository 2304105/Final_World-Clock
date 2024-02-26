package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class One_Cognizant extends BasePage {

	public One_Cognizant(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy (xpath="//*[text()=\"OneCognizant\"]") WebElement ele;
    @FindBy (xpath="//div[@class='viewAllHotAppsBtn']") WebElement ele2;
    @FindBy (xpath="//div[@class ='aZHolder']/div")
	public List<WebElement> ele3;
    @FindBy(xpath="//div[@id='div_appFilteredList']//div[@class='col s6 m3 l2 appStoreAppDiv']")
	static
    List<WebElement> ex;
    
    

    public List<String> allApp;
    
    public void onecognizant()
	{
	ele.click();
	}
    
    public List<String> apps(){
    	
    	System.out.println(ex.size());
    	System.out.println("ok");

    	allApp=new ArrayList<>();
    	for(int i=0;i<ex.size();i++) {
		
		String k = ex.get(i).getText();
		System.out.println(k);
		allApp.add(k);
		
		
	}
	
    	
    	return allApp;
    }
    
	public void hotapps()
	{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",ele2);
	
	}
	
	public void hotapps2() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele2);
	}

}
