package coreJava;
import java.util.*;

public class HashsetEx {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Sankari");
		hs.add("Aditi");
		hs.add("Hari");
		System.out.println(hs);
		
		System.out.println(hs.contains("Aditi"));
		
		Iterator<String>  it = hs.iterator();
		System.out.println(it.next());
		
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
		
		

	}

}
