package Oops;

interface Calc
{
	public void add();
	public void sub();
}
interface AdvanceCalc
{
	public void squareroot();
}
class Calculator implements Calc,AdvanceCalc
{

	@Override
	public void squareroot() 
	{
		System.out.println("Squareroot");
	}

	@Override
	public void add() 
	{
		System.out.println("Add");
	}

	@Override
	public void sub() 
	{
		System.out.println("Sub");
	}
}

public class Interfaceprgrm {

	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
		c.add();
		c.squareroot();
		c.sub();

	}

}
