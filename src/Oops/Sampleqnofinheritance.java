package Oops;

class Member
{
	String name;
	int age;
	int Phoneno;
	String address;
	int salary;
	
	public void printdetails()
	{
		System.out.println("Name = "+name+"\nAge = "+age+"\nPhone Number = "+Phoneno+"\nAddress = "+address+"\nSalary = "+salary);
	}
	
	
}
class Employee extends Member
{
	String specialization;
	
}
class Manager extends Member
{
	String department;
}

public class Sampleqnofinheritance {

	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		emp.name="Sneha";
		emp.age=21;
		emp.Phoneno=977817249;
		emp.address="Pangattu House";
		emp.salary=500000;
		
		emp.printdetails();
		
		System.out.println(emp.specialization="Python");
		
		Manager mg=new Manager();
		System.out.println(mg.department="Coumputer Science");
		
		
	}

}
