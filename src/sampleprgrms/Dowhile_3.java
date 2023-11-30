package sampleprgrms;

import java.util.Scanner;

public class Dowhile_3 {

	public static void main(String[] args) 
	{
		char ch;
		do
		{
		    
			System.out.println("Enter Two Numbers : ");
			Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int sum=0;
			
			
			
				sum=n1+n2;
				System.out.println("The sum is "+sum);
			
			System.out.println("Do you want to continue? (Y/N)");
			ch=sc.next().charAt(0);
			}
			while(ch=='Y'||ch=='y');
		

	}

}
