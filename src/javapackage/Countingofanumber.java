package javapackage;

import java.util.Scanner;

public class Countingofanumber {

	public static void main(String[] args) 
	{
		char ch;
		do
		{
			System.out.println("Enter a Number : ");
			Scanner sc=new Scanner(System.in);
			
			int a=sc.nextInt();
			int count=0;
			
			while(a>0)
			{
				a=a/10;
				count++;
			}
			System.out.println("Number of Digits = "+count);
			System.out.println("Do you want to enter another number(Y/N)");
			
			ch=sc.next().charAt(0);
			
		}
		while(ch=='Y'||ch=='y');

	}

}
