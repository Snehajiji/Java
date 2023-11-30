package Oops;

abstract class Car1
{
	abstract public void acceleration();
	abstract public void speedLimit();
	
	public void musicSystem()
	{
		System.out.println("Music");
	}

	
}
class Bmw extends Car1
{
	public void acceleration()
	{
		System.out.println("BMW Acceleration");
	}

	@Override
	public void speedLimit() 
	{
		System.out.println("BMW Speedlimit");
		
	}
	
}
class Kia extends Car1
{

	@Override
	public void acceleration() 
	{
		System.out.println("Kia Acceleration");
		
	}

	@Override
	public void speedLimit() 
	{
		System.out.println("Kia speedlimit");
	}
	
}


public class Abstraction {

	public static void main(String[] args) 
	{
		Bmw ob=new Bmw();
		ob.acceleration();
		ob.speedLimit();
		ob.musicSystem();
		
		Kia ob1=new Kia();
		ob1.acceleration();
		ob1.speedLimit();
		ob1.musicSystem();

	}

}



