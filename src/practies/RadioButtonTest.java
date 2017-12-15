package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.shadi.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("rblGender_1")).click();

	}

}
