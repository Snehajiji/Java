package Oops;
class Employee12
{
	private String name;
	private String designation;
	//right click ---> source ---> generate setter&getter ---> click on name&designation ---> Generate
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) 
	{
		Employee12 ob=new Employee12();
		ob.setName("Sneha");
		System.out.println(ob.getName());
		
		ob.setDesignation("Manager");
		System.out.println(ob.getDesignation());

	}

}
