package javapackage;

import java.util.Scanner;

public class Positiveornegativeifelse {

	public static void main(String[] args) 
	
	{
		char ch;
		do 
		{
	
		System.out.println("Enter a number : ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		if(a>=0)
		{
			System.out.println("a is positive");
		}
		else
		{
			System.out.println("a is negative");
		}
		
		System.out.println("Do you want to continue? (Y/N)");
		ch=s.next().charAt(0);
		}
		while ((ch=='Y'||ch=='y'));
		
			
	}

}
