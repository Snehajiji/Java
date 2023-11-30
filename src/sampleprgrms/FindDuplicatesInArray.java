package sampleprgrms;

public class FindDuplicatesInArray {

	public static void main(String[] args) 
	{
		int[] ar={1,1,2,3,3,4,4,5,7,7,0};
		System.out.println("Duplicate elements in the array are :");
		
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]);
		
				}
			}
		}

	}

}
