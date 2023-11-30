package javapackage;

import java.util.Scanner;

public class Multiplicationusingarray {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int mul=0;
		for (int i=1;i<10;i++)
		{
			
			mul=a*i;
			System.out.println(i+"*"+a+"="+mul);
		}
		


	}

}
