package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DashboardPage {

	public WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	By accountButton = By.xpath("//*[@id=\"__next\"]/div/header/div[1]/div/div/div[3]/div[4]/button/div");
	By emailOrPhone = By.xpath("//input[@placeholder='Write your email or phone']");
	By enterPassword = By.xpath("//input[@placeholder='Enter password']");
	By loginButton = By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div/div/form/button");
	
	public WebElement accountButton()
	{
		return driver.findElement(accountButton);
	}
	
	public WebElement emailOrPhone()
	{
		return driver.findElement(emailOrPhone);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(enterPassword);
	}
	
	public WebElement loginButton()
	{
		return driver.findElement(loginButton);
	}
	
	
	
}
