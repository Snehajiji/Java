package Oops;

public class Polymorphism_methodoverloading {

	public static void main(String[] args) 
	{
		Polymorphism_methodoverloading pm=new Polymorphism_methodoverloading();
		pm.add();
		pm.add(54,21);
		pm.add(76,45.67);
		pm.add(100.1,23);

	}
	
	public void add()
	{
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println("The sum is "+c);
		
	}
	public void add(int a,int b)
	{
		System.out.println("The sum is "+(a+b));
	}
	
	public void add(int a,double b)
	{
		System.out.println("The sum is "+(a+b));
	}
	
	public void add(double a,int b)
	{
		System.out.println("The sum is "+(a+b));
	}

}
