package demohack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class demo {
	public static WebDriver driver;
	public static List<String> list = new ArrayList<>();;

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Car EMI
		WebElement car = driver.findElement(By.id("car-loan"));
		car.click();

		WebElement ab= driver.findElement(By.xpath("//*[@id=\"loanamountslider\"]"));
		
		Actions move = new Actions(driver);
        Action action1 = (Action) move.dragAndDropBy(ab, 163, 0).build();
        action1.perform();
        
        WebElement home_amt = driver.findElement(By.id("loanamount"));
        String homeamt = home_amt.getText();
		System.out.println(homeamt);

//		
		WebElement car2 = driver.findElement(By.xpath("//*[@id=\"loaninterestslider\"]/div"));
//
//        Action action2 = (Action) move.dragAndDropBy(car2, 120, 0).build();
//        action2.perform();
//		
//		WebElement car3 = driver.findElement(By.xpath("//*[@id=\"loantermslider\"]/div"));
//
//		Action action3 = (Action) move.dragAndDropBy(car3, -130, 0).build();
//        action3.perform();
//        
//		WebElement emi1 = driver.findElement(By.xpath("//*[@id=\"leschemewrapper\"]/div/div/div/div/label[1]"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();",emi1);
//		emi1.click();
//		
//		WebElement emi2 = driver.findElement(By.id("emiamount"));
//		String emi3 = emi2.getText();
//		System.out.println(emi3);
//		
//		Thread.sleep(4000);
//		WebElement year = driver.findElement(By.xpath("//*[@id=\"year2024\"]"));
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("arguments[0].scrollIntoView();",year);
//		year.click();
//		
//		System.out.println("Advance");
//		
//		WebElement pa = driver.findElement(By.xpath("//*[@id=\"monthyear2024\"]/td/div/table/tbody/tr[2]/td[2]"));
//		String p = pa.getText();
//		System.out.println(p);
//		
//		WebElement ia = driver.findElement(By.xpath("//*[@id=\"monthyear2024\"]/td/div/table/tbody/tr[2]/td[3]"));
//		String i = ia.getText();
//		System.out.println(i);
//		
//		//up
//		WebElement emi5 = driver.findElement(By.xpath("//*[@id=\"leschemewrapper\"]/div/div/div/div/label[2]"));
//		JavascriptExecutor j2 = (JavascriptExecutor) driver;
//		j2.executeScript("arguments[0].scrollIntoView();",emi5);
//		emi5.click();
//		
//		
//		//2nd 
//		WebElement year1 = driver.findElement(By.xpath("//*[@id=\"year2024\"]"));
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js2.executeScript("arguments[0].scrollIntoView();",year1);
//		year1.click();
//		
//		System.out.println("Arrears");
//		
//		WebElement pa1 = driver.findElement(By.xpath("//*[@id=\"monthyear2024\"]/td/div/table/tbody/tr[2]/td[2]"));
//		String p1 = pa1.getText();
//		System.out.println(p1);
//		
//		WebElement ia1 = driver.findElement(By.xpath("//*[@id=\"monthyear2024\"]/td/div/table/tbody/tr[2]/td[3]"));
//		String i1 = ia1.getText();
//		System.out.println(i1);
//
//		WebElement menu = driver.findElement(By.id("menu-item-dropdown-2696"));
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("arguments[0].scrollIntoView();",menu);
//		menu.click();
//		
//		WebElement home = driver.findElement(By.xpath("//*[@id=\"menu-item-3294\"]/a"));
//		home.click();
//		
//		WebElement year2 = driver.findElement(By.xpath("//*[@id=\"year2024\"]"));
//		JavascriptExecutor js4 = (JavascriptExecutor) driver;
//		js4.executeScript("arguments[0].scrollIntoView();",year2);
//		year2.click();
//		
//		List<WebElement> table = driver.findElements(By.xpath("//*[@id=\"paymentschedule\"]/table/tbody/tr"));
//		for(int l =1;l<table.size();l++) {
//			 String a = table.get(l).getText();
//			 System.out.println();
//			 System.out.println(a);
//			 list.add(a);
			 
		WebElement men2 = driver.findElement(By.id("menu-item-dropdown-2696"));
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("arguments[0].scrollIntoView();",men2);
		men2.click();
//				
		WebElement loan_cal = driver.findElement(By.xpath(""));
		loan_cal.click();
////		
		WebElement emiclac = driver.findElement(By.id("emi-calc"));
		emiclac.click();
//		
//		WebElement loan_am = driver.findElement(By.xpath("//*[@id=\"loanamountslider\"]/div"));
//		
//		Action action4 = (Action) move.dragAndDropBy(loan_am, 112, 0).build();
//        action4.perform();
        
//        WebElement loan_ami = driver.findElement(By.id("loanamount"));
//        String loan_amu = loan_ami.getAttribute("value");
//        System.out.println(loan_amu);
//        
        WebElement loan_in = driver.findElement(By.id("loaninterestslider"));
//		
		Action action5 = (Action) move.dragAndDropBy(loan_in, 112, 0).build();
        action5.perform();
//        
//        WebElement loan_rate = driver.findElement(By.id("loaninterest"));
//        String loan_ra = loan_rate.getAttribute("value");
//        System.out.println(loan_ra);
//        
//        WebElement loan_t = driver.findElement(By.xpath("//label[text()=\"Loan Amount\"]"));
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("arguments[0].scrollIntoView();",loan_t);
//
//        
//        WebElement loan_te = driver.findElement(By.id("loantermslider"));
////		
//		Action action6 = (Action) move.dragAndDropBy(loan_te, -150, 0).build();
//        action6.perform();
//        
//        WebElement loan_ten = driver.findElement(By.xpath("//*[@id=\"loantermslider\"]/span"));
//        String loan_tenu = loan_ten.getAttribute("style");
//        System.out.println(loan_tenu);
//        
//        Thread.sleep(3000);
//        
//        WebElement loan = driver.findElement(By.id("loanterm"));
//        loan.clear();
//
//        
//        WebElement loan_tenw = driver.findElement(By.xpath("//*[@id=\"loantermslider\"]/span"));
//        String loan_tenur = loan_tenw.getAttribute("style");
//        System.out.println(loan_tenur);
//        
//        WebElement month = driver.findElement(By.xpath("//*[@id=\"ltermwrapper\"]/div[1]/div/div/div/div/div/label[2]"));
//        month.click();
//        
//        WebElement loan_te1 = driver.findElement(By.id("loantermslider"));
//		
//		Action action7 = (Action) move.dragAndDropBy(loan_te1, -150, 0).build();
//        action7.perform();
//        
//        WebElement loan_ten1 = driver.findElement(By.xpath("//*[@id=\"loantermslider\"]/span"));
//        String loan_tenu1 = loan_ten1.getAttribute("style");
//        System.out.println(loan_tenu1);
//        
//        Thread.sleep(3000);
//        
//        WebElement loan1 = driver.findElement(By.id("loanterm"));
//        loan1.clear();

        
//        WebElement loan_tenw1 = driver.findElement(By.xpath("//*[@id=\"homeloanterm\"]"));
//        loan_tenw1.sendKeys(Keys.BACK_SPACE);
        
        
        
        
	}
		
		
		
		
		
		
		
	}
