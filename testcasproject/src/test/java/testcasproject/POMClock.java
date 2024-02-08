package testcasproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class POMClock {

	public WebDriver driver;
	POMClock (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		//Title 
	@FindBy(id="CaptionElementView")
	WebElement Title_clock;
	//Bangalore, India (IST)
	@FindBy(xpath="//*[@id='vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]") 
	WebElement india_loc;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/span[1]")
	WebElement india_time;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/div[2]")
	WebElement day_date;
	//london 
	@FindBy(xpath="//*[@id='vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	WebElement lon_loc;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/span[1]")
	WebElement lon_time;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]")
	WebElement lon_date;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]")
	WebElement lon_ind_gap;
	//NY
	@FindBy(xpath="//*[@id='vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]")
	WebElement ny_loc;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/span[1]")
	WebElement ny_time;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[2]/div[2]") 
	WebElement ny_date;
	@FindBy(xpath="//*[@id=\"vpc_WebPart.WorldClockWebPart.internal.60655e4a-73c8-49d0-9571-c762791557af\"]/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[2]/div[1]") 
	WebElement ny_india_gap;

	
 
	
	//getting all time dates

	public boolean checkclockbox(){
		boolean present=Title_clock.isDisplayed();
		return present;
	}
	//India Clock
	public boolean checkindiaclock() {
		boolean bangtitle=india_loc.isDisplayed();	
		return bangtitle;
	}
	public String checkindiatime() {
		String in_time = india_time.getText();
		return in_time;
	}
	public String chechindiadate() {
		return day_date.getText();
	}
	//LONDON CLOCK
	public boolean checklonclock() {
		boolean lontitle=lon_loc.isDisplayed();
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
		String lonbang_gap=lon_ind_gap.getText();
		return lonbang_gap;
	}
	//NY CLOCK
	public boolean nyclock() {
		boolean nytitle=ny_loc.isDisplayed();
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
		String nybang_gap = ny_india_gap.getText();
		return nybang_gap;

}
}
