package methods;

public class EmpAdd {

	public static void main(String[] args) 
	{
		String fName="sel1233";
		OHRMFunctions obj=new OHRMFunctions();
		obj.appLaunch("http://opensource.demo.orangehrmlive.com/");
		obj.appLogin("Admin", "admin");
		//empList
		obj.empAdd("selenium123", "sel567");
		obj.appLogout();

	}

}
