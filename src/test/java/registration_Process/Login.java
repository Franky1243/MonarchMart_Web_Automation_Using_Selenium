package registration_Process;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import resources.Base;

public class Login extends Base {

	
	public static WebDriver driver;
	@BeforeTest
	public void initalize() throws IOException
	{
		driver = browserInitialization();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws InterruptedException, IOException
	{
		DashboardPage DashboardPageObject = new DashboardPage(driver);
		DashboardPageObject.accountButton().click();
		DashboardPageObject.emailOrPhone().sendKeys("mdsohelmahmud73@gmail.com");
		DashboardPageObject.enterPassword().sendKeys("sohel123456");
		DashboardPageObject.loginButton().click();
		Thread.sleep(2000);
		
		WebElement accountButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div[1]/div/div/div[3]/div[4]/button/div"));
		
		Actions action = new Actions(driver);
		action.moveToElement(accountButton);
		
		WebElement dashboardButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div[1]/div/div/div[3]/div[4]/div/a[2]/div/h2"));
		action.moveToElement(dashboardButton);
		action.click().build().perform();
		
		getScreenshot("Account created successfully");
	}
	
	@AfterTest
	public void closeBrower()
	{
		driver.close();
		driver = null;
	}
	
}
