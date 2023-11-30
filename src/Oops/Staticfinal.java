package Oops;

public class Staticfinal 
{
	String empname;
	static String companyname="Luminar";
	final float pi=3.14f;
	//final static float pi=3.14f;

	public static void main(String[] args) 
	{
		Staticfinal ob=new Staticfinal();
		System.out.println(ob.empname);
		System.out.println(companyname);
		System.out.println(companyname="Luminar Technolab");
		System.out.println(companyname);
		System.out.println(ob.pi);
		

	}

}
