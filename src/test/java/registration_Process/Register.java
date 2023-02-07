package registration_Process;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.SignUpPage;
import resources.Base;

public class Register extends Base {

	@BeforeTest
	public void initialize() throws IOException
	{
		driver = browserInitialization();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void register() throws InterruptedException, IOException
	{
		LandingPage LandingPageObject = new LandingPage(driver);
		LandingPageObject.userAccount().click();
		LandingPageObject.signup().click();
		
		SignUpPage SignUpPageObject = new SignUpPage(driver);
		SignUpPageObject.userFirstName().sendKeys("Sohel");
		SignUpPageObject.userLastName().sendKeys("Sarker");
		SignUpPageObject.userPhoneNumber().sendKeys("01838596832");
		SignUpPageObject.userEmail().sendKeys("sohel.cse889@gmail.com");
		SignUpPageObject.userPass().sendKeys("sohel123456");
		SignUpPageObject.userConfirmPass().sendKeys("sohel123456");
		SignUpPageObject.termsCheckbox().click();
		SignUpPageObject.registerNow().click();
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver = null;
	}
	
	
	
}
