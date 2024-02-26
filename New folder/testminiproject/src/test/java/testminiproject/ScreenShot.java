package testminiproject;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	public static void takeScreenShot(WebDriver driver,String fileName) {
		try {
		TakesScreenshot ss = ((TakesScreenshot) driver);
		File srcFile = ss.getScreenshotAs(OutputType.FILE);
		File destFile = new File(".\\screenshots\\"  + fileName);
		FileUtils.copyFile(srcFile, destFile);
		} 
		
		catch(IOException e) {
			System.out.println("could not take screenshot");
			}
		}

}
