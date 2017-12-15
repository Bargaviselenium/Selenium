package practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.Credentials;

public class AlertTest
{

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("HYDERABAD");
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(3000);
		 
			
			
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		//click on ok
		alt.accept();
		//click on close
		//alt.dismiss();

	}

}
