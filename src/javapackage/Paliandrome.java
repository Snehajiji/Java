package javapackage;

public class Paliandrome {

	public static void main(String[] args) 
	{
		int n=101;
		int temp=n;
		
		int r;
		int s=0;
		
		while(n>0)
		{
			r=n%10; //1   //3   //2
			s=s*10+r; //1   //10+3=13   //13*10+2=132
			n=n/10; //23   //2  //0
		}
		System.out.println("Reverse of number is "+s);
		
		if(temp==s)
		{
			System.out.println("Paliandrome");
		}
		else
		{
			System.out.println("Not Paliandrome");
		}
		

	}

}
