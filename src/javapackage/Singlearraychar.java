package javapackage;

import java.util.Scanner;

public class Singlearraychar {

	public static void main(String[] args) 
	{
		System.out.println("Enter the characters : ");
		Scanner sc=new Scanner(System.in);
		
		String[] str=new String[10];
		
		for (int i=0;i<10;i++)
		{
			str[i]=sc.nextLine();
		}
		System.out.println("Entered String is ");
		
	//	for (int i=0;i<10;i++)
	//	{
	//		System.out.println(str[i]);
	//	}
	
		//OR
		
		for (String v:str)
		{
			System.out.println(v);
		}
			
		
		
		
		
		

	}

}
