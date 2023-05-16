
public class Methodsfunctions {

	public static void main(String[] args) {
		
	Methodsfunctions s = new Methodsfunctions();
	String name= s.getData();
//(when using static keyword, neednot create a object from its own class)
		 getData2();
		System.out.println(name);
      Methodsdemo d1 = new Methodsdemo();
      d1.getUserdata();
      
	}
	public  String getData()
	{
		System.out.println("hello world");
		return "sankari";
		
	}

	
	
	public static String getData2()
	{
		System.out.println("hello world");
		return "sankari";
		
	}

}
