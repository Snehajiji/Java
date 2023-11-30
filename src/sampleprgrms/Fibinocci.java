package sampleprgrms;

import java.util.Scanner;

public class Fibinocci {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1,b=1,c=0;
		
		System.out.println("Fibinocci series of "+n+" :");
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
		



}
