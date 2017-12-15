package practies;

import java.util.List;


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarTest {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String date=sc.next();
		//String date="12/November/2018";
		
		String [] dateSplict=date.split("/");
		String day=dateSplict[0];
		String month=dateSplict[1];
		String year=dateSplict[2];
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='DepartDate']")).click();
		
		//year Selection
		String calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!calYear.equals(year))
		{
			driver.findElement(By.className("nextMonth")).click();
			calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
				}
		//Month Selection
		
	String calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while(!calMonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.className("nextMonth")).click();
			calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		//day Selection
		//rows count
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr"));
		//System.out.println(rows.size());
		for (int i = 0; i < rows.size(); i++)
		{
		//coloumn count
			List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
			//System.out.println(col.size());
			for (int j = 0; j < col.size(); j++) 
			{
				String calDay=col.get(j).getText();
				if (calDay.equals(day)) 
				{
				col.get(j).click();
				break;
				}
			}
			
		}
		
		

	}

}
