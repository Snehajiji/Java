package Oops;
class Vehicle
{
	public void drive()
	{
		System.out.println("Repairing a car");
	}
}
class Car extends Vehicle
{

	@Override
	public void drive() 
	{
		super.drive();
	}
	
}

public class Methodoverriding1 {

	public static void main(String[] args) 
	{
		Car cr=new Car();
		cr.drive();

	}

}
