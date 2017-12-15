package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		//identifying frames by using tagname
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		//giving focus to particular frame by using switch to method
		driver.switchTo().frame(0);
		
	WebElement sl=driver.findElement(By.xpath(".//*[@id='slider']/span"));	
	
	Actions sld=new Actions(driver);
	
	sld.clickAndHold(sl).moveByOffset(70, 0).release(sl).build().perform();
	Thread.sleep(3000);
 	sld.clickAndHold(sl).moveByOffset(-70, 0).release(sl).build().perform();
	}

}
