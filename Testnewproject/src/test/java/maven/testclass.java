package maven;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import com.sun.org.apache.bcel.internal.classfile.Utility;

import baseClass.Broser;
import pomPack.Loginpage;


public class testclass extends Broser{


	WebDriver driver;

	Loginpage loginpage;
	int testCasrID;
	
	@Parameters("alpha")
	
	@BeforeTest
	public void launchbrowser(String alpha)
	{
		if(alpha.equals("Chromebrowser"))
		{
			driver= openChromeBrowser();
		}
		
		if(alpha.equals("Firefoxbrowser"))
		{
			driver= openFirefoxBrowser();
		}
	}
	
	
	@BeforeClass
	public void launchBrowser()
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		driver= new ChromeDriver();
		
		Broser.openChromeBrowser();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);*/
		
		loginpage = new Loginpage(driver);
		
		
	}
	@BeforeMethod
	public void loginApplication() throws InterruptedException, EncryptedDocumentException, IOException
	{
		driver.get("https://www.facebook.com");
		String data=utlityclass.ExcelfileHandle("Sheet1",1,0);
		loginpage.sendUsername(data);
		 data=utlityclass.ExcelfileHandle("Sheet1",1,1);
		loginpage.sendpassword(data);
		loginpage.clicklogin();
		
	}
	
	@Test
	

	

	public void testvalidateurl()
	{
		String url= driver.getCurrentUrl();
		SoftAssert s= new SoftAssert();
		Assert.assertEquals(url, "https://www.facebook.com/checkpoint/disabled/?next");
		
	}
	
	@Test
	public void testtitle()
	{
		
		testCasrID=177;
		String url= driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.faceboo");
	}
	
	@AfterClass
	
	public void closeapp() {
		
		loginpage=null;
		driver=null;
		System.gc();
		System.out.println("close");
		
	}
		
		 @AfterMethod
		public void screenshotcapture(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus())
		{
			utlityclass.Screenshot(testCasrID, driver);
			//Utility.captureScreenshot(testCasrID, driver);
			System.out.println("screenshot captured");
		}
		
		
		
	}

}

