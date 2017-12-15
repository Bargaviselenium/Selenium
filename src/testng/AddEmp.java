package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmp extends OrangeHRM
{
@Test
public void empAdd()
{
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys("vasu789");
	driver.findElement(By.id("lastName")).sendKeys("deva123");
	driver.findElement(By.id("btnSave")).click();
}
}
