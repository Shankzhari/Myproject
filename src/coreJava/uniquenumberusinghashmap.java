package coreJava;

import java.util.*;

public class uniquenumberusinghashmap {

	public static void main(String[] args) {
		
		int array[] = {3,2,4,5,5,6,6,7,1,3,2};
		
		HashSet<Integer> mp = new HashSet<Integer>();
		
		for(int i =0;i<array.length;i++)
		{
			
			mp.add(array[i]);
			
		}
		
		System.out.println(mp);
		

	}

}
