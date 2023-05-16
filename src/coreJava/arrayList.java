package coreJava;
import java.util.*;

public class arrayList {

	public static void main(String[] args) {
		

		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Java");
		a.add("Anika");
		a.add(1, "Aditi");
//		a.remove(2);
//		a.removeAll(a);
		System.out.println(a.get(1));
		System.out.println(a);
		
		System.out.println(a.contains("Java"));
		System.out.println(a.size());
		
		System.out.println(a.isEmpty());
		
	}

}
