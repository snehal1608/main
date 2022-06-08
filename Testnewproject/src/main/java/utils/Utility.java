package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	
	
	public static void Screenshot(int testCasrID, WebDriver driver)
	{
	/* TakesScreenshot s= (TakesScreenshot) driver;
		
		File source =s.getScreenshotAs(OutputType.FILE);
		//File dest= new File("C:\\Users\\DELL\\Desktop\\automation.jpeg");
		File dest= new File("C:\\Users\\DELL\\Desktop\\automation.jpeg");
		FileHandler.copy(source, dest); */
		
		TakesScreenshot s= (TakesScreenshot) driver;
		File source= s.getScreenshotAs(OutputType.FILE);
		File dest= new File("test-output\\screenshotfailed\\testcase123.jpeg");
		FileHandler.copy(source, dest);
	}
}
