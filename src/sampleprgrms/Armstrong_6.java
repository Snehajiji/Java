package sampleprgrms;

import java.util.Scanner;

public class Armstrong_6 {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0,r=0,temp=n;
		
		while(n>0) 
		{
			rem=n%10;
			r=r+(rem*rem*rem);
			n=n/10;
			
		}
		if(r==temp)
		{
			System.out.println(temp+"is a Armstrong number");
		}
		else
		{
			System.out.println(temp+" is not Armstrong number");
		}
			

	}

	

}
