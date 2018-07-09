import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HandlingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*HashSet<String> a = new HashSet<String>();
		a.add("30");
		a.add("40");
		a.add("80");
		a.add("56s0");
		a.add("30");
		
		System.out.println(a.size());*/
		
		/*LinkedHashSet<Integer> a=new LinkedHashSet<Integer>();
		a.add(30);
		a.add(40);
		a.add(80);
		a.add(50);
		a.add(30);*/
		
		TreeSet<Integer> a = new TreeSet<Integer>(Collections.reverseOrder());
		a.add(30);
		a.add(40);
		a.add(80);
		a.add(50);
		a.add(30);
		a.add(10);
		a.add(5);
		
		Iterator <Integer> j=a.iterator();
		while (j.hasNext())
		{
			System.out.println(j.next());
		}
		
		
		
	}

}
