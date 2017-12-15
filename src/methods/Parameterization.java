package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parameterization
{
public static FirefoxDriver driver;
	public static void main(String[] args)
	{
		String url="http://gmail.com";
		//call by value method
		//appLaunch("http://gmail.com");
		//call by reference
		appLaunch(url);
		appLogin("Admin", "admin");

	}
//appLaunch	
	public static void appLaunch(String url)
	{
	 driver=new FirefoxDriver();
		driver.get(url);
	}
//appLogin
	
	public static void appLogin(String userName,String password)
	{
	System.out.println("UserName Is : "+userName);	
	System.out.println("Password is : "+password);
	}
	
	
	
}
