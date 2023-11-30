package javapackage;

import java.util.Scanner;

public class Scannerprgrm {

	public static void main(String[] args) 
	{
		System.out.println("Enter First number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.println("Enter second number");
		int b=sc.nextInt();
		
		System.out.println("The sum is "+(a+b));
		

	}

}
