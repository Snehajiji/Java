package sampleprgrms;

import java.util.Scanner;

public class endswith_1 {

	public static void main(String[] args) 
	{
		String c;
		System.out.println("Enter a string : ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		System.out.println(s.endsWith("language"));
		
		if(s.endsWith("language"))
		{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
				

	}

}
