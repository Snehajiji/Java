package Oops;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
		try
		{
			int a=10,b=0;
			double c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception");
			System.out.println(e.getMessage());
		}
		System.out.println("Hello");
		
		
		int[] ar=new int[2];
		ar[0]=23;
		try
		{
		System.out.println(ar[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			System.out.println("arrayindex");
		}

	}
	
	

	
}
