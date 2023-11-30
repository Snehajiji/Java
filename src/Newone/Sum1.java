package Newone;

import java.util.Scanner;

public class Sum1 
{
	public void sum()
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("The sum = "+sum);
		
	
	}
	
	
	public static void main(String[] args) 
	{
		Sum1 s=new Sum1();
		s.sum();

	}

}
