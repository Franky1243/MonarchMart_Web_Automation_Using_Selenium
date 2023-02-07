package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

	public WebDriver driver;
	public SignUpPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By userFirstName = By.xpath("//input[@placeholder='Write your first name']");
	By userLastName = By.xpath("//input[@placeholder='Write your last name']");
	By userPhoneNumber = By.xpath("//input[@placeholder='Write your phone number']");
	By userEmail = By.xpath("//input[@placeholder='Write your email address']");
	By userPass = By.xpath("//input[@placeholder='Password']");
	By userConfirmPass = By.xpath("//input[@id='mantine-r1']");
	By termsCheckbox = By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div/div/form/div[7]/div/input");
	By registerNow = By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div/div/form/button");
	
	
	
	public WebElement userFirstName()
	{
		return driver.findElement(userFirstName);
	}
	
	public WebElement userLastName()
	{
		return driver.findElement(userLastName);
	}
	
	public WebElement userPhoneNumber()
	{
		return driver.findElement(userPhoneNumber);
	}
	
	public WebElement userEmail()
	{
		return driver.findElement(userEmail);
	}
	
	public WebElement userPass()
	{
		return driver.findElement(userPass);
	}
	
	public WebElement userConfirmPass()
	{
		return driver.findElement(userConfirmPass);
	}
	
	public WebElement termsCheckbox()
	{
		return driver.findElement(termsCheckbox);
	}
	
	public WebElement registerNow()
	{
		return driver.findElement(registerNow);
	}
	
}
