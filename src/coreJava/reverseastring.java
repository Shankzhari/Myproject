package coreJava;

public class reverseastring 
{
	
	public static String revstr(String str) 
	{	
		String strrev ="";
		for(char ch: str.toCharArray())
		{
			strrev = ch+strrev;
		}
		return strrev;
	}

	public static void main(String[] args) {
		
		String str="hello";
		System.out.println(revstr(str));

	}

}
