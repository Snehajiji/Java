package javapackage;

public class Whichisgreater {

	public static void main(String[] args) 
	{
		int a=42,b=23,c=32;
		
		if(a>b && a>c) 
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}

	}

}
