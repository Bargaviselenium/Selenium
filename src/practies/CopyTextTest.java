package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyTextTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/advanced_search");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("_dKg")).sendKeys("Bargavi");
		driver.findElement(By.id("_dKg")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("_dKg")).sendKeys(Keys.CONTROL+"c");
		
		driver.findElement(By.id("_aKg")).sendKeys(Keys.CONTROL+"v");
	}

}
