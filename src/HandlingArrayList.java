import java.util.ArrayList;
import java.util.Iterator;

public class HandlingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[]=new int [3];
		x[0]=20;
		x[1]=25;
		
		ArrayList<Integer> c= new ArrayList<Integer>();
		c.add(12);
		c.add(15);
		c.add(13);
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(12);
		a.add(15);
		a.add(13);
		a.add(14);
		a.add(19);
		a.add(10);
		a.addAll(c);
		a.remove(4);
		//a.removeAll(c);
		
		
		/*int x1=a.size();
		System.out.println(x1);*/
		
		System.out.println(a.size());
		System.out.println(a.get(3));
		
		/*for (int i=0;i<x1;i++)
		{
			System.out.println(a.get(i));
		}*/
		
		Iterator <Integer> it =a.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
	}

}
