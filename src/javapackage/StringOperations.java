package javapackage;

public class StringOperations {

	public static void main(String[] args) 
	{
//Concat
		String s1="Hello";
		String s2="Welcome";
		String s3="hello";
		String s4="     hello     ";
		String s5="Hello Welcome to Luminar";
		
		System.out.println(s1.concat(s2));//helloWelcome
		System.out.println(s1+s2);//helloWelcome
		System.out.println(1+3+s1+4+5);//4Hello45
		
//equals
		System.out.println(s1.equals(s2));//False
		System.out.println(s1.equalsIgnoreCase(s3));//True
		
//to lower and to upper case
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
//contains
		System.out.println(s1.contains("luminar"));
		
//length
		System.out.println(s1.length());
		
//starts with
		System.out.println(s1.startsWith("Hello"));//true
		
//ends with
		System.out.println(s1.endsWith("Luminar"));//False
		
//substring
		System.out.println(s1.substring(0,3));//Hel
		
//trim
		System.out.println(s4.trim());//To remove white space
		
//split
		String[]st=s5.split(" ");
		for(String v:st)
		{
			System.out.println(v);
		}
		
//replace
		System.out.println(s5.replace("Hello","Hai"));
		
//charAt
		System.out.println(s1.charAt(1));//e
		
		

	}

}
