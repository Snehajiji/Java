package sampleprgrms;

public class ReplaceSpace {

	public static void main(String[] args) 
	{
		String originalString="Exception Handling in Java";
		String newString=originalString.replace(' ','-');
		
		System.out.println("Original String : "+originalString);
		System.out.println("Replaced String : "+newString);
		

	}

}
