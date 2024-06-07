package myMap;
import java.util.*;
//import java.util.Hashtable;
public class MyHashMap {
	public static void main(String [] args)
	{
		//Hashtable<Integer , String> indmap = new Hashtable<Integer,String> ();
		HashMap<Integer , String> indmap = new HashMap<Integer,String> ();
		indmap.put(18, "Virat Kohli");
		indmap.put(45, "Rohit Sharma");
		indmap.put(7, "MS Dhoni");
		indmap.put(1, "KL Rahul");
	
		HashMap<Integer,String> ausmap = new HashMap<Integer,String>();
		ausmap.put(30, "Pat Cummins");
		ausmap.put(62, "Travis Head");
		ausmap.put(85, "Tim David");
		
		HashMap<Integer,String> iplmap = new HashMap<Integer,String>();
		iplmap.putAll(indmap);
		iplmap.putAll(ausmap);
		
		System.out.println("Iterating the map using keySet() ");
		Set<Integer> s = indmap.keySet();
		for(Integer i : s)
		{
			System.out.println("key" + " " + i);
		}
		System.out.println("Iterating the map using values() ");
		Collection<String> c = indmap.values();
		for(String i : c)
		{
			System.out.println("key" + " " + i);
		}
		System.out.println(indmap.size());
		System.out.println(ausmap.size());
		System.out.println(iplmap.size());
		System.out.println(indmap.containsKey(45));
		System.out.println(indmap.containsKey(6));
		System.out.println(indmap.containsValue("Virat "));
		System.out.println(indmap.containsValue("Virat Kohli"));
		ausmap.remove(85);
		System.out.println(ausmap.size());
		System.out.println(ausmap.get(45));
		System.out.println(ausmap.values());
		System.out.println(iplmap.keySet());
		System.out.println(iplmap.entrySet());
		iplmap.remove(45);
		System.out.println(iplmap.size());
		
	}
}
