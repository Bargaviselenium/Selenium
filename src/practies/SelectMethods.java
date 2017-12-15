package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods {

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://amazon.in");
		driver.manage().window().maximize();
		//identify dropdwon and stored in a variable
	WebElement drop=driver.findElement(By.id("searchDropdownBox"));
	
	Select slt=new Select(drop);
	//slt.selectByIndex(7);
	//slt.selectByValue("search-alias=electronics");
	//slt.selectByVisibleText("Baby");
	List<WebElement> dropList=slt.getOptions();
	System.out.println(dropList.size());
	for (int i = 0; i < dropList.size(); i++) 
	{
		System.out.println(dropList.get(i).getText());
		
	}
	
	}

}
