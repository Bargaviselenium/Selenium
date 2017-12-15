package methods;

public class NonStaticMethods {

	public static void main(String[] args) 
	{
		//Calling Non Static methods by using an Object with Same ClassName
		NonStaticMethods obj=new NonStaticMethods();
		//obj.appLaunch();
		//obj.appLogin();
		String res=obj.appLogin();
		System.out.println(res);
	}

	//Non Static method without return values
	
	public void appLaunch()
	{
		System.out.println("Non Static method without return values");
	}
	//Non Static method with return values
	
		public String appLogin()
		{
			System.out.println("Non Static method with return values");
			return "Pass";
		}
}
