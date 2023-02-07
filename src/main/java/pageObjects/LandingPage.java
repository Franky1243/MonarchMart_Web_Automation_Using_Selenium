package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	By userAccount = By.xpath("//*[@id=\"__next\"]/div/header/div[1]/div/div/div[3]/div[4]/button/div");
	By signup = By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div/div/div[3]/h2/a/button");
	
	
	public WebElement userAccount()
	{
		return driver.findElement(userAccount);
	}
	
	public WebElement signup()
	{
		return driver.findElement(signup);
	}
	
}
