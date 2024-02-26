package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Be_Cognizant extends BasePage {

	public Be_Cognizant(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//User Validation
	
	public void clickOnUserIcon() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement user= wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id='O365_MainLink_MePhoto']/div/div/div/div/div[2]"))));
	    wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id='O365_MainLink_Settings']/div"))));
	    Thread.sleep(3000);
		user.click();
		}
	
	@FindBy(xpath="//*[@id='mectrl_headerPicture']")
	WebElement clickback;
		
		public void clickbackuser() {
			clickback.click();
		}
		
		
	//World Clock 
	@FindBy(xpath="(//*[@id=\"CaptionElementView\"])[3]")
	WebElement Title_clock;
	public String checkclockbox(){
		String present=Title_clock.getText();
		return present;
	}

	//Bangalore, India (IST)
	
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[1]") 
	WebElement india_loc;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[1]")
	WebElement india_time;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/div[2]")
	WebElement day_date;
	
	public String checkindiaclock() {
		String bangtitle=india_loc.getText();	
		return bangtitle;
	}
	public String checkindiatime() {
		return india_time.getText();
	}
	public String chechindiadate() {
		return day_date.getText();
	}
	
	//london 
	
	@FindBy(xpath="(//*[@data-automation-id='clock-card-location'])[2]")
	WebElement lon_loc;
	@FindBy(xpath="//*[@id='vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af']/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/span[1]")
	WebElement lon_time;
	@FindBy(xpath="//*[@id='vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af']/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]")
	WebElement lon_date;
	@FindBy(xpath="//*[@id='vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af']/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]")
	WebElement lon_ind_gap;
	public String checklonclock() {
		String lontitle=lon_loc.getText();
		return lontitle;
	}
	public String checklontime() {
		String lontime = lon_time.getText();
		return lontime;
	}
	public String checklondate() {
		String londate = lon_date.getText();
		return londate;
	}
	public String checklongaptime() {
		String longap=lon_ind_gap.getText();
		return longap;
	}
	
	//NY
	
	@FindBy(xpath="(//*[@data-automation-id='clock-card-location'])[3]")
	WebElement ny_loc;
	@FindBy(xpath="//*[@id='vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af']/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/span[1]")
	WebElement ny_time;
	@FindBy(xpath="//*[@id='vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af']/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[2]/div[2]") 
	WebElement ny_date;
	@FindBy(xpath="//*[@id='vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af']/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[2]/div[1]") 
	WebElement ny_india_gap;
	public String nyclock() {
		String nytitle=ny_loc.getText();
		return nytitle;
	}
	public String checknytime() {
		String nytime = ny_time.getText();
		return nytime;
	}
	public String checknydate() {
		String nydate = ny_date.getText();
		return nydate;
	}
	public String checknyindiagaptime() {
		String nygap=ny_india_gap.getText();
		return nygap;
}
}
	


