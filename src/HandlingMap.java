import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HandlingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*HashMap<String,String> a=new HashMap<String,String>();
		a.put("name", "adi");
		a.put("Company","Virtusa");
		a.put("Dept", "Testing");
		a.put("Area", "DLF");*/
		
		
		/*LinkedHashMap<String,String> a=new LinkedHashMap<String,String>();
		a.put("name", "adi");
		a.put("Company","Virtusa");
		a.put("Dept", "Testing");
		a.put("Area", "DLF");*/
		
		TreeMap<String,String> a=new TreeMap<String,String>(Collections.reverseOrder());
		a.put("name", "adi");
		a.put("Company","Virtusa");
		a.put("Dept", "Testing");
		a.put("Area", "DLF");
		a.put("name", "JJ");
		
		System.out.println(a.get("name"));
		
		
		Set d= a.entrySet();
		Iterator it=d.iterator();
		
		
	//	Iterator it=a.entrySet().iterator();
		
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//Iterator it

	}

}
