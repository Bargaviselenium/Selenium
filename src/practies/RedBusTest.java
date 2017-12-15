package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBusTest {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://Redbus.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='src']")).sendKeys("H");
		Thread.sleep(3000);
		
	List<WebElement> city=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
System.out.println(city.size());
for (int i = 0; i < city.size(); i++) 
{
	//System.out.println(city.get(i).getText());
	if (city.get(i).getText().equals("Hosur")) 
	{
		city.get(i).click();
		break;
	}
}
	}

}
