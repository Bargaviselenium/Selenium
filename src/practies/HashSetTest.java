package practies;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) 
	{
		
Set<String> s=new HashSet<>();
s.add("Vasudeva");
s.add("Selenium");
s.add("QTP");
s.add("Vasudeva");

Iterator<String> it=s.iterator();

while(it.hasNext())
{
	System.out.println(it.next());
}
//System.out.println(s.size());
	}

}
