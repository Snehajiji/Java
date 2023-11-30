package Oops;
class Parent1
{
	public void phone()
	{
		System.out.println("Samsung");
	}
}
class Child1 extends Parent1
{

	@Override
	public void phone() 
	{
		System.out.println("Iphone");
		super.phone();
	}
	
}

public class Methodoverriding {

	public static void main(String[] args) 
	{
		Child1 cd=new Child1();
		cd.phone();
		
	}

}
