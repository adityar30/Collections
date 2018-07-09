import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class HandlingHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Hashtable a= new Hashtable();
		
		/*a.put("name", "Google");
		a.put("Client",null);*/  //Hashtable will not accept Null values,
		
		/*HashMap b=new HashMap();
		b.put("name", "Yahoo");
		b.put("Client",null);*/
		
		ArrayList<Integer> c=new ArrayList<Integer>();
		c.add(15);
		c.add(560);
		c.add(9089);
	//	Collections.sort(c);
		Collections.sort(c,Collections.reverseOrder());
		
		Iterator<Integer> it =c.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
