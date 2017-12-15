package practies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest 
{

	public static void main(String[] args) throws Exception 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		//handle pop up
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div[3]/div[1]/img")).click();
		
		//HomePage Window ID
		String homePage=driver.getWindowHandle();
		//System.out.println(homePage);
		
		//click on Login
		driver.findElement(By.id("loginsubmit")).click();
		//Getting Multiple  widow ids
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		while(it.hasNext())
		{
			String currentWindowId=it.next().toString();
			//System.out.println(currentWindowId);
			if (!homePage.equals(currentWindowId)) 
			{
				//giving focus to second window
				driver.switchTo().window(currentWindowId);
				//click on continue to internet banking
				Thread.sleep(3000);
				driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
			}
		}
		
		
	driver.quit();	
		
	}

}
