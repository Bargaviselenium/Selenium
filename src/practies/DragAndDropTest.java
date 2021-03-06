package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//identifying frames by using tagname
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		//giving focus to particular frame by using switch to method
		driver.switchTo().frame(0);
		
		WebElement drg=driver.findElement(By.id("draggable"));
		WebElement drp=driver.findElement(By.id("droppable"));
		
		Actions dAd=new Actions(driver);
		
		dAd.dragAndDrop(drg,drp).build().perform();
	}

}
