package Oops;

class Animal1
{
	public void animalfood()
	{
		System.out.println("Animalfood");
	}
}
class Tiger extends Animal1
{
	public void tigerMethod()
	{
		System.out.println("tigermethod");
	}
}

class Lion extends Animal1
{
	public void lionMethod()
	{
		System.out.println("lionmethod");
	}
}

public class Hierarchicalinheritance {

	public static void main(String[] args) 
	{
		Tiger tg=new Tiger();
		tg.animalfood();
		tg.tigerMethod();
		
		Lion ln=new Lion();
		ln.animalfood();
		ln.lionMethod();

	}

}
