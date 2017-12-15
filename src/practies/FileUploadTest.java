package practies;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadTest {

	public static void main(String[] args) throws Exception {
		//AppLaunch
				FirefoxDriver driver=new FirefoxDriver();
				driver.get("http://opensource.demo.orangehrmlive.com");
				driver.manage().window().maximize();
				//AppLogin
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin");
				driver.findElement(By.id("btnLogin")).click();
				//EmpCreation
				driver.findElement(By.linkText("PIM")).click();
				driver.findElement(By.linkText("Add Employee")).click();
				driver.findElement(By.id("firstName")).sendKeys("bargavi");
				driver.findElement(By.id("lastName")).sendKeys("Selenium");
				driver.findElement(By.xpath(".//*[@id='photofile']")).click();
				
				Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\vasuautoit.exe");
				Thread.sleep(3000);
				driver.findElement(By.id("btnSave")).click();

	}

}
