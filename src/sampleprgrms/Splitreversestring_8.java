package sampleprgrms;

public class Splitreversestring_8 {

	public static void main(String[] args) 
	{
		String s="Testing Training Centre";
		String[] st=s.split(" ");
		
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]+" ");
		}

	}

}
