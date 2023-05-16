package coreJava;

public class ExceptionsDemo {

	public static void main(String[] args) {
	
		int a=5;
		int b =0;
		
		int arr[]= {1,2,3,4,5};
		
		try
		{
//			int k = a/b;
//			System.out.println(k);
			System.out.println(arr[7]);
		}
		catch(ArithmeticException At )
		{
			System.out.println("I got Arithmetic Exception ");
		}
		catch(IndexOutOfBoundsException AE)
		{
			System.out.println("I got arr Exception ");
		}
		catch(Exception e)
		{
		System.out.println("I Catched the exception");	
			
		}
		finally
		{
			System.out.println("Delete Cookies");
		}
		
	}

}
