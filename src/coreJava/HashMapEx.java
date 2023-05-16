package coreJava;

import java.util.*;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		
	
		HashMap<Integer,String > hm = new HashMap<Integer, String>();
		hm.put(0, "USA");
		hm.put(1, "UK");
		hm.put(2, "India");
		hm.put(3, "Canada");
		
		hm.remove(3);
		System.out.println(hm);
		
		System.out.println(hm.get(2));
		
		Set<Entry<Integer, String>> hashset = hm.entrySet();
		
		Iterator<Entry<Integer, String>> it = hashset.iterator();
		
		while(it.hasNext())
		{
			
			Map.Entry<Integer, String> mp = (Entry<Integer, String>)it.next();
			System.out.println(mp.getKey()+" " +mp.getValue());
//			System.out.println()
		
		
		

	}
	}
}


	
	
