package Oops;

class Parent
{
	int a=20,b=50,c;
	public void add()
	{
		c=a+b;
		System.out.println("Sum = "+c);
	}
}
class Child extends Parent
{
	public void sub()
	{
		int d;
		d=b-a;
		System.out.println("Difference = "+d);
	}
}

public class Singlelevelinheritance {

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.add();
		c.sub();
		System.out.println(c.a);
		System.out.println(c.b);
		

	}

}
