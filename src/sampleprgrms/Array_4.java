package sampleprgrms;


public class Array_4 {

	public static void main(String[] args) 
	{
		
		
		int[] ar= {2,-3,5,6,7,0,9,-1};
		
		int positivecount=0;
		int negativecount=0;
		int zerocount=0;
		
		for(int num:ar )
		{
			if(num>0)
			{
				positivecount++;
			}
			else if(num<0)
			{
				negativecount++;
			}
			else
			{
				zerocount++;
			}
		}
		System.out.println("Positivecount = "+positivecount);
		System.out.println("Negativecount = "+negativecount);
		System.out.println("Zerocount = "+zerocount);
		
		

	}

}
