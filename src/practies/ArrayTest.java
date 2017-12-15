package practies;

public class ArrayTest {

	public static void main(String[] args)
	{
		//declaration of array
		//syntax:
		//datatype arrayName[]=new datatype[size];
		
		int a[]=new int[5];
		//retreving intial values of an array
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//inserting values
		a[0]=11;
		a[1]=12;
		a[2]=13;
		a[3]=14;
		a[4]=15;
		
		//retreving  values after inserting 
		System.out.println("############");
				/*System.out.println(a[0]);
				System.out.println(a[1]);
				System.out.println(a[2]);
				System.out.println(a[3]);
				System.out.println(a[4]);*/
		/*for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}*/
		for(int x:a)
		{
			System.out.println(x);
		}
		
	}

}
