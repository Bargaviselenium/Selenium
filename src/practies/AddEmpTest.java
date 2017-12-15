package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddEmpTest
{

	public static void main(String[] args) 
	{
		//AppLaunch
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		//AppLogin
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		//EmpCreation
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("bargavi");
		driver.findElement(By.id("lastName")).sendKeys("Selenium");
		driver.findElement(By.id("btnSave")).click();
		if (driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed()) 
			{
				System.out.println("Emp Created Successfully");
			}else
			{
				System.out.println("Emp Created Faild");
			}
		//AppLogout
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		//AppClose
		driver.close();
	}

}
