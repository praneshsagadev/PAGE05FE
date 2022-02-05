package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonUtils.PropertyInitializer;

public class PageObj {

	@FindBy(id = "txtUsername")
	public static WebElement username;

	@FindBy(id = "txtPassword")
	public static WebElement password;

	@FindBy(id = "btnLogin")
	public static WebElement button;
	
	

	public static void enterUser() {
		
		username.sendKeys(PropertyInitializer.getProperty("USERNAME"));

	}
	
	public static void enterPass() {
		
		password.sendKeys(PropertyInitializer.getProperty("PASSWORD"));
		
	}
	
	public static void clickButton() {
		
		button.click();
		
	}
	
	

}
