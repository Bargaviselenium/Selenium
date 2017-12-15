package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AfterTestAndBeforeTet 
{
	public static FirefoxDriver driver;
	@BeforeTest
	public void appLaunch()
	{
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		}
	@Test
	public void appLogin()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	}
	@AfterTest
	public void appLogout()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();	
	}
}
