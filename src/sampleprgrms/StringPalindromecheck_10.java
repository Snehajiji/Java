package sampleprgrms;

public class StringPalindromecheck_10 {

	public static void main(String[] args) 
	{
		String s="malayalam";
		String revstr="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			revstr=revstr+s.charAt(i);
		}
		
		if(revstr.equals(s))
		{
			System.out.println(s+" is palindrome");
		}
		else
		{
			System.out.println(s+" is not Palindrome");
		}

	}

}
