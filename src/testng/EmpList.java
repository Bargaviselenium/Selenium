package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EmpList extends OrangeHRM
{
@Test
public void empList()
{
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Employee List")).click();
			
	//rows count
List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
//System.out.println(rows.size());

//cloumn Count
for (int i = 0; i < rows.size(); i++) 
{
List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
//System.out.println(col.size());
//retreiving 5 coloumn data
	System.out.println(col.get(4).getText());


}
}
}
