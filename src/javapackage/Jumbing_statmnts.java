package javapackage;

public class Jumbing_statmnts 
{

	public static void main(String[] args) 
	{
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
				break;
				//continue;
			}
			System.out.println(i);
		}
		System.out.println (sum());

	}
	



public static int sum()
{
	int a=20,b=30,c;
	c=a+b;
	return c;
}
}