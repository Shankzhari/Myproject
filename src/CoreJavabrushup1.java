
public class CoreJavabrushup1 {

	public static void main(String[] args) {
//	int	myNum= 5;
//	String Myname = "sankari";
//	char letter = 'r';
//	boolean status = true;
//	System.out.println(myNum+" is the value stored in variable");
	
	int[] arr = {1,2,3,4,5};
//	
//	for(int i =0; i< arr.length;i++)
//	{
//		System.out.println(arr[i]);
//	}
	for(int i: arr)
	{
		System.out.println(i);
	}
	
	String[] name = {"siva","sankari","ammu"};
	
//	for(int i=0; i<name.length;i++) 
//	{
//		System.out.println(name[i]);
//	}
	
	for(String s: name)
	{
		System.out.println(s);
	}
	}

}
