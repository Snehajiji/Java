package javapackage;

import java.util.Scanner;

public class Sumoftennumarray {

	public static void main(String[] args) 
	{
		System.out.println("Enter the numbers : ");
		Scanner sc=new Scanner(System.in);
		
		
		int sum=0;
		int []ar=new int[10];
		
		
		for (int i=0;i<10;i++)
		{
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
			
		}
		
		System.out.println("The sum is "+(sum));
		


	}

}
