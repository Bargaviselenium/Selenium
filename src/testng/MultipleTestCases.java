package testng;

import org.testng.annotations.Test;

public class MultipleTestCases 
{
@Test()
public void appLaunch()
{
	System.out.println("AppLaunch");
}
@Test(dependsOnMethods="appLaunch")
public void appLogin()
{
	System.out.println("AppLogin");
}
@Test(dependsOnMethods="appLogin")
public void appClose()
{
	System.out.println("AppClose");
}
}
