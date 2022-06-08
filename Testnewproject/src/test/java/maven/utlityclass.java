package maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utlityclass {
	
	static String  value1;

	public static void Screenshot(int testCasrID, WebDriver driver) throws IOException
	{
	/* TakesScreenshot s= (TakesScreenshot) driver;
		
		File source =s.getScreenshotAs(OutputType.FILE);
		//File dest= new File("C:\\Users\\DELL\\Desktop\\automation.jpeg");
		File dest= new File("C:\\Users\\DELL\\Desktop\\automation.jpeg");
		FileHandler.copy(source, dest); */
		
		TakesScreenshot s= (TakesScreenshot) driver;
		File source= s.getScreenshotAs(OutputType.FILE);
		File dest= new File("test-output\\screenshotfailed\\testcase123789.jpg");
		FileHandler.copy(source, dest);
	}
	
	
	public static String  ExcelfileHandle(String sheetname, int row, int col) throws EncryptedDocumentException, IOException
	{
		
		String path="C:\\Users\\DELL\\Desktop\\sheet.xlsx";
		FileInputStream file1= new FileInputStream(path);
		//String value1= WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		 try {
			 value1= WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}
		
			return value1 ; 
		
}
}