package sampleprgrms;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) 
	{
		
		
		Vowelcount v=new Vowelcount();
		int ans=v.count();
		System.out.println("Count of vowels = "+ans);

	}
	public int count()
	{
		System.out.println("Enter a string : ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for (int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		return count;
		
	}

}
