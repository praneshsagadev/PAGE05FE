package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonUtils.PropertyInitializer;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.PageObj;

public class LoginTest {
	
	static WebDriver driver;
	
	@Test
	public void loginFunction() {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//PropertyInitializer property = new PropertyInitializer();
		
		PropertyInitializer.initializeProperty();
		
		
		PageFactory.initElements(driver, PageObj.class);
		
		System.out.println("ok);
		
		
		
	}
	
	
	
	

}
