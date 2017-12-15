package practies;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotsTest {

	public static void main(String[] args) throws IOException
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Users\\vasu\\Desktop\\ScreenShots\\vasu.png"));	
		
	}

}
