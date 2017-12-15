package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		//identifying frames by using tagname
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		//giving focus to particular frame by using switch to method
		driver.switchTo().frame(0);
		
	WebElement rs=driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		
Actions rsz=new Actions(driver);

rsz.clickAndHold(rs).moveByOffset(80, 100).release(rs).build().perform();
	}

}
