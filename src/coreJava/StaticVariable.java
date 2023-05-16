package coreJava;

public class StaticVariable {
	
	
	String name;
	String address;
	static String city = "Madurai";
	static int i=0;
	
	
	public StaticVariable(String name,String address)
	{
		this.name = name;
		this.address=address;
		i++;
	
		
	}
	
	public String getAddress()
	{
		return address;
	}
	public static void getCity()
	{
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		
		StaticVariable obj = new StaticVariable("Bob","Tmm");
		StaticVariable obj1 = new StaticVariable("Kani","tvl");
		obj.address="tirumanglam";
		System.out.println(obj.getAddress());
		System.out.println(obj1.getAddress());
		getCity();
		i = 4;
		System.out.println(i);
		
		
		
		

	}

}
