package practies;


import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDwonTest {

	public static void main(String[] args) throws Exception 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ceoandhra.nic.in/home.aspx");
		driver.manage().window().maximize();
		
Thread.sleep(3000);
	
	Actions sc=new Actions(driver);
	sc.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	}

}
