package sampleprgrms;

interface Basicanimal
{
	public void eat();
	public void sleep();
}
class Monkey implements Basicanimal
{
	public void jumb()
	{
		System.out.println(" Monkey Jumb");
	}
	public void bite()
	{
		System.out.println("Monkey Bite");
	}
	@Override
	public void eat() 
	{
		System.out.println("Basic animal Eat");
	}
	@Override
	public void sleep() 
	{
		System.out.println("Basic animal Sleep");
	}
	
}
class Human extends Monkey
{
	public void speak()
	{
		System.out.println("Human speak");
	}
	
}

public class Animals {

	public static void main(String[] args) 
	{
		Human ob=new Human();
		ob.jumb();
		ob.bite();
		ob.eat();
		ob.sleep();
		ob.speak();

	}

}
