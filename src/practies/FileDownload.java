package practies;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath(".//*[@id='menu_download']/a")).click();
		driver.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\fd.exe");
	}

}
