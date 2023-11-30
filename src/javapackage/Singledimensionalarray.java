package javapackage;

import java.util.Scanner;

public class Singledimensionalarray {

	public static void main(String[] args) 
	{
		System.out.println("Enter the numbers : ");
		Scanner sc=new Scanner(System.in);
		
		int[] ar=new int[5];
		
		for(int i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Entered numbers = ");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(ar[i]);
		}
		
		

	}

}
