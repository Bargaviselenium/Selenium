package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreationOfXpath {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		//customized xpath
		driver.findElement(By.xpath("//a[@class='gb_P']")).click();

	}

}
