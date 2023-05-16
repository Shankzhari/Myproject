package coreJava;

import java.util.*;

public class PrintUniquenumber 
{

	public static void main(String[] args) 
	{
		int a[] = {4,6,6,6,5,5,2,2};
//		ArrayList<Integer> ab = new ArrayList<Integer>();
//		for(int i = 0;i<a.length;i++)
//		{
//			int k = 0;
//			if(!ab.contains(a[i]))
//			{	ab.add(a[i]);
//				k++;
//				for(int j =i+1;j<a.length;j++)
//					{
//					if(a[i]==a[j])
//					{
//						k++;
//							
//					}
//						
//					}
//				if(k==1)
//					{
//						System.out.println(a[i]+" is the unique number");
//					}	
//				
//					
////					System.out.println(a[i]+" "+ k);
//			}
//			
//		}
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0 ;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		System.out.println(hs);
	}

}


