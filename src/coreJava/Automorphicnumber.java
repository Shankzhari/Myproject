package coreJava;

public class Automorphicnumber {
	
	
	public static boolean numisautomorphic(int num) {
		
		int value = num*num; 
		
		while(num>0)
		{
			if(num%10 != value%10)
			 return false;
			
				num = num/10;
				value=value/10;
			
		}
			return true;
		}
		
		
		
	

	public static void main(String[] args) {
		int num = 6;
		
		System.out.println(numisautomorphic(num));
		
		

	}

}
