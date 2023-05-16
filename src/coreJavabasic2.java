import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coreJavabasic2 {

	public static void main(String[] args) {
		
//		int[] arr = {1,2,4,5,6,8,10,122};
//		
//		for(int num : arr)
//		{
//			if( num %2 == 0)
//			{
//				System.out.println(num);
//			}
//			
//		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("sankari");
		a.add("siva");
		a.add("selenium");
		
////		a.remove(2);
//		
//		for( String val : a)
//		{
//			System.out.println(val);
//		}
//		
		System.out.println(a.contains("selenium"));
		
		String[] name= {"siva","selenium","agile"};
		List<String> nameArrayList = Arrays.asList(name);
		nameArrayList.contains("selenium");
		
		String s = "Rahul shetty academy";
		String[] splittedstring = s.split("shetty");
		for(String val : splittedstring)
		{
			System.out.println(val.trim());
			
		}
		
		
//		To print string in reverse order
		
		String S= "Rahul shetty";
		for(int i=S.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
		}
	

		
		
		
	}


