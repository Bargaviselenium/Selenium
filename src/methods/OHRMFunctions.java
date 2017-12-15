package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OHRMFunctions 

{
	public static FirefoxDriver driver;
	public static String res;
	public static void main(String[] args)
	{
	//appLaunch();
		OHRMFunctions obj=new OHRMFunctions();
String results=obj.appLaunch("http://opensource.demo.orangehrmlive.com/");
System.out.println(results);
obj.appLogin("Admin","admin");
	}
//appLaunch
	public  String appLaunch(String url)
	{
		String res;
		 driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		if (driver.findElement(By.id("btnLogin")).isDisplayed()) 
		{
		res="Pass";	
		}else
		{
		res="Fail";
		}
		return res;
	}
	//appLogin
	
	public String appLogin(String userName,String password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(userName);	
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		if(driver.findElement(By.id("welcome")).isDisplayed())
		{
			res="pass";
		}
		else
		{
			res="fail";
		}
		return res;
		
	}
//empCreation
	
	public String empAdd(String fName,String lName)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		driver.findElement(By.id("btnSave")).click();
		if (driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed()) 
			{
				res="Pass";
			}else
			{
				res="Fail";
			}
		return res;
	}
	//logout
	public String appLogout()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		if (driver.findElement(By.id("btnLogin")).isDisplayed()) 
		{
		res="Pass";	
		}else
		{
		res="Fail";
		}
		return res;
	}
}
