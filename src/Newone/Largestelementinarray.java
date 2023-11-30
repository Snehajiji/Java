package Newone;

import java.util.Scanner;

public class Largestelementinarray {

	public static void main(String[] args) 
	{
		System.out.println("Enter the numbers : ");
		Scanner sc=new Scanner(System.in);
		
		int[] ar=new int[5];
		int largest=0;
		
		for (int i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
			if(ar[i]>largest)
			{
				largest=ar[i];
			}
		}
		System.out.println("The largest number is : "+largest);

	}

}
