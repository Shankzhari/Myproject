package coreJava;

public class ChildDemo extends ParentDemo {
	
	
	String name= "Aditi";
	
	public ChildDemo()
	{	
		super();
		System.out.println("Child construct");
	}

	public void getData()
	{
		System.out.println("Im from the child class");
		System.out.println(name);
		System.out.println(super.name);
		super.getData();
		
	}
	public static void main(String[] args) {
		
		ChildDemo cd = new ChildDemo();
//		cd.getData();
		
		
		
		
	}

}
