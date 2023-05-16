package coreJava;

public class ConstructDemo {
	
	
	public ConstructDemo()
	{
		System.out.println("Hi!I'm default construct");
	}
	
	public ConstructDemo(int a, int b)
	{
		System.out.println("Hi!I'm parameterised construct");
	}
	
	

	public static void main(String[] args) {
		
		
		ConstructDemo cd = new ConstructDemo();
		ConstructDemo cdp = new ConstructDemo(3,5);
	}

}
