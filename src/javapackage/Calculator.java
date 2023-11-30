package javapackage;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
	
	    char ch;
		do 
		{
		System.out.println("Enter the number which operation we want to perform : \n1.Addition \n2. Substraction \n3. Multiplication \n4.Division");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter 2 numbers : ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		
		switch (a)
		{
		case 1:
			
			System.out.println("The Sum is "+(n1+n2));
			break;
			
		case 2:
			
			System.out.println("The Difference is "+(n1-n2));
			break;
			
		case 3:
			
			System.out.println("The Product is "+(n1*n2));
			break;
			
		case 4:
			
			System.out.println("The Quotient is "+(n1/n2));
			break;
			
		default:System.out.println("INVALID");
			
		
		}
		System.out.println("Do you want to continue? (Y/N) : ");
		 ch=sc.next().charAt(0);
		 }
		while(ch=='Y'||ch=='y'); 
		
		
		
		
		

	}

}
