package Newone;

import Oops.Accessmodifiers;

//constructor program
public class Employee {
	int empid;
	String empname;
	String empdesignation;
	
	public Employee(int empid,String empname,String empdesignation)
	{
		this.empid=empid;
		this.empname=empname;
		this.empdesignation=empdesignation;
	}
	public void display()
	{
		System.out.println("Empid = "+empid);
		System.out.println("Empname = "+empname);
		System.out.println("Empdesignation = "+empdesignation);
	}

	public static void main(String[] args) 
	{
		Employee emp1=new Employee(01,"abc","Tester");
		emp1.display();
		
		Employee emp2=new Employee(02,"bcd","Tester");
		emp2.display();
		
		
		//To check Accessmodifiers.... Not related to this prgrm
		Accessmodifiers ob2=new Accessmodifiers();
		ob2.d=5;
		

	}

}
