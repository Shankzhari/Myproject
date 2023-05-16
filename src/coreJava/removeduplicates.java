package coreJava;

public class removeduplicates {
	
	
	public static String remdup(String str)
	{
		String strnodup ="";
		
		for(char ch : str.toCharArray())
		{
			if(!strnodup.contains(String.valueOf(ch))){
				strnodup +=ch;
			}
		}
		return strnodup;
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		String str= "hellllooo";
		System.out.println(remdup(str));
	}

}
