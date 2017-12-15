package practies;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args)
	{
		
		ArrayList<Integer> s=new ArrayList<>();
		s.add(56);
		s.add(89);
		System.out.println(s.size());
		for (int i = 0; i < s.size(); i++) 
		{
		System.out.println(s.get(i));	
		}

	}

}
