package practies;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleMethods {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		String pageSource=driver.getPageSource();
		if (pageSource.contains("images"))
		{
			System.out.println("Pass");
		}
		driver.close();

	}

}
