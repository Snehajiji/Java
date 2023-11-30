package javapackage;

public class Methodprgrm {

	public static void main(String[] args) 
	{
		Methodprgrm ob=new Methodprgrm();
		ob.add();
		ob.sub(30,20);
		int ans=ob.mul();
		System.out.println(ans);
		double division=ob.div(45,5);
		System.out.println(division);

	}
	
//Method without returntype and without parameter
	public void add()
	{
		int a=20,b=30,c;
		c=a+b;
		System.out.println(c);
		
	}
	
//Method without returntype and with parameter
	public void sub(int a,int b)
	{
		double c=a-b;
		System.out.println(c);
		
	}
	
//Method with returntype and without parameter
	public int mul()
	{
		int a=5,b=6,m;
		m=a*b;
		return m;
	}
	
//Method with returntype and with parameter
	public double div(int s,int e)
	{
		double q=s/e;
		return q;
	}

}
