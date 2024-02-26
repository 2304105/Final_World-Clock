package testminiproject;

import java.io.File;
import java.time.LocalTime;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	public static void takeScreenShot(WebDriver driver) {
		try {
		TakesScreenshot ss = ((TakesScreenshot) driver);
		File srcFile = ss.getScreenshotAs(OutputType.FILE);
		LocalTime time = LocalTime.now();
	    String ssFile = time.toString().replace(":", "").replace(".", "") + ".png";
		File destFile = new File(System.getProperty("user.dir") + "\\screenshots\\"  + ssFile);
		FileUtils.copyFile(srcFile, destFile);
		} catch(Exception e) {
			
			}
		}

}
