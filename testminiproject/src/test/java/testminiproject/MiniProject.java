/*
 * Case Study: Search For Schools
 * Problem Statement:Find school details in Eduvidya application.
 * 
 * Suggested site: https://www.eduvidya.com/
 * Detailed Description:
 	Open the browser
	Enter the url https://www.eduvidya.com/
	Click on "Schools" link in the Menu bar
	Click on "Course-Type" dropdown and select “CBSE” from the list
	Click on "City" dropdown and select “Pune” from the list
	Click on "Search" button
	Verify Search results is displayed or not
	Close the browser
 */



package testminiproject;
 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;
 
public class MiniProject {
	
	public static WebDriver driver;
	public static List<WebElement> scList;
	
	@Test(priority =1)
	public WebDriver driver() {
		driver = DriverSetup.getWebdriver();
		return driver;

	}
	@Test(priority =2)

	public void loadPage() { 
		driver.findElement(By.id("details-button")).click(); 
		driver.findElement(By.id("proceed-link")).click();
		ScreenShot.takeScreenShot(driver);

	}
	@Test(priority =3)

	public void selectSchool() {
		
		driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[4]/a")).click();
		ScreenShot.takeScreenShot(driver);

	}
	@Test(priority =4)

	public void selectBoard() {
		WebElement all = driver.findElement(By.xpath("//*[@id=\"ddl_Category\"]"));
		all.click();
		Select droppattern = new Select(all);
		droppattern.selectByVisibleText("CBSE");
		ScreenShot.takeScreenShot(driver);
	}
	@Test(priority =5)

	public  void selectCity() {
		WebElement city = driver.findElement(By.xpath("//*[@id=\"ddl_City\"]"));
		city.click();
		Select dropcity = new Select(city);
		dropcity.selectByVisibleText("Pune");
		ScreenShot.takeScreenShot(driver);
		

	}
	@Test(priority =6)

	public  void search() {
		
		driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();
		ScreenShot.takeScreenShot(driver);
		

	}
	@Test(priority =7)

	public  String verifyResult() {
		boolean list = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[3]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/ul/li[1]/div[2]/a")).isDisplayed();
		if(list) {
			System.out.println("Result is displayed");
		}
		else {
			System.out.println("Result is not displayed");
		}

		
		System.out.println();
		return null;
		
	}
	@Test(priority =8)

	public void displayResult() {
		WebElement list = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[3]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/ul/li[1]/div[2]/a"));
		String b = list.getText();
		System.out.println(b);
	}
	@Test(priority =9)

	public List<WebElement> schoolList(){
		
		scList = driver.findElements(By.xpath("//*[@class=\"rec_links\"]"));
		ExcelUtility.dataToExcel(scList);
		for(WebElement sl : scList) {
			System.out.println(sl.getText());
		}
		ScreenShot.takeScreenShot(driver);
		return scList;
		
	}
	@AfterClass

	public void close() {
		driver.quit();
	}
	
 
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		MiniProject mn = new MiniProject();
//		
//		mn.driver();
//		mn.loadPage();
//		mn.selectSchool();
//		mn.selectBoard();
//		mn.selectCity();
//		mn.search();
//		mn.verifyResult();
//		mn.displayResult();
//		mn.schoolList();
//		mn.close();
//	}
}




		



		

		

		
		
