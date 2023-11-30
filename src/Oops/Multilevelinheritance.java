package Oops;
class Animal
{
	public void animalfood()
	{
		System.out.println("Animal food");
	}
}
class Dog extends Animal
{
	public void barking()
	{
		System.out.println("Barking");
	}
}
class Babydog extends Dog
{
	public void babydogdetails()
	{
		System.out.println("Babydog details");
	}
}


public class Multilevelinheritance {

	public static void main(String[] args) 
	{
		Babydog bd=new Babydog();
		bd.animalfood();
		bd.barking();
		bd.babydogdetails();

	}

}
