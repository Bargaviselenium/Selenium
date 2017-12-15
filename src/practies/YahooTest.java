package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest {

	public static void main(String[] args) 
	{
		String expTitle="Selenium - Yahoo India Search Results";
		//launching fire fox browser
		FirefoxDriver driver=new FirefoxDriver();
		//navigate to url
		driver.get("https://in.yahoo.com/?p=us");
		//maximize window
		driver.manage().window().maximize();
		//identify the search field with id property and enter selenium
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
		//identify search button with id and perform click operation
		driver.findElement(By.id("uh-search-button")).click();
		
		String actTitle=driver.getTitle();
		if (expTitle.equals(actTitle))
		{
			System.out.println("pass");
		}else
		{
			System.out.println("Fail");
		}
		

	}

}
