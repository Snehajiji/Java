package javapackage;

public class Nestedifprogram {

	public static void main(String[] args) 
	{
		int age=21;
		char gender='M';
		
		if(age>18)
			if(gender=='M')
			{
				System.out.println("Male");
			}
			else
			{
				System.out.println("Female");
			}

	}

}
