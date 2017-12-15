package practies;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods 
{
	public static FirefoxDriver driver;
	public static String res;
		public static void main(String[] args)
		{
		String results=	appLaunch();
		System.out.println(results);
		
		String res1=appLogin();
		System.out.println(res1);
		}
		public static String appLaunch()
			{
					
			  driver=new FirefoxDriver();
				driver.get("http://opensource.demo.orangehrmlive.com/");
				driver.manage().window().maximize();
				if (driver.findElement(By.id("btnLogin")).isDisplayed())
				{
					res="pass";
				}
				else
				{
					res="fail";
				}
				return res;
			}
			public static String appLogin()
			{
							
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");	
			driver.findElement(By.id("txtPassword")).sendKeys("admin");
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
			
}
	

