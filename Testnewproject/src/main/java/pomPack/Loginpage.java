package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy (xpath="//input[@id='email']") 
	
	private WebElement userName ;
	
	@FindBy (xpath="//input[@id='pass']") 
	
	private WebElement password ;
	
	@FindBy (xpath="//button[@name='login']") 
	
	private WebElement login ;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUsername(String user) {
		
		userName.sendKeys(user);
	}
	public void sendpassword(String pass) {
		
		password.sendKeys(pass);
	}
	public void clicklogin() {
		
		login.click();
	}
	
	
	

}
