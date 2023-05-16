package coreJava;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		
		ChildClass cc = new ChildClass();
		cc.brakes();
		cc.color();
		cc.engine();
		cc.audiosystem();//function  overriding(same methods both in parent and child class) 
		cc.getData(5);
		cc.getData("Aditi");//function overloading (methods with same name)
		
	}
	
	public void engine()
	{
		
		System.out.println("Engine is implemented");
		
	}
	public  void color()
	{
		System.out.println(color);
	}
	public void audiosystem()
	{
		System.out.println("new audio child");
	}
	public void getData(int a)
	{
	System.out.println(a);
	}
	public void getData(String a)
	{
		System.out.println(a);
	}

}
