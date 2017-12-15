package methods;

public class StaticMethods {

	public static void main(String[] args)
	{
	//calling Static methods by MethodName
	appLaunch();	
    appLogin();
    //calling method by using a variable to see the retun value
    String res=appLogin();
    
    System.out.println(res);
	}
	
	//Static methods without return value
	
	public static void appLaunch()
	{
		System.out.println("Static methods without return value");
	}
	
	//Static methods with return value
	
	public static String appLogin()
	{
		System.out.println("Static methods with return value");
		return "Pass";
	}

}
