package maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annutation {
	
	@BeforeSuite
	
	public void Suite()
	{
		System.out.println("@Suite");
	}
	@Parameters("alpha")
	
	@BeforeTest
	
		public void beforeTest(String data)
		{
			System.out.println("@@BeforeTest");
			System.out.println(data);
		}
		

	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("@BeforeClass");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("@AfterClass");
	}
	
	

	@AfterTest
	
		public void afterTest()
		{
			System.out.println("@@afterTest");
		}
	
	@Test
	public void test()
	{
		System.out.println("test");
	}
	

}
