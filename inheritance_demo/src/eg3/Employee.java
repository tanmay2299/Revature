package eg3;

//import eg3.Address;
import eg3.Person;
//import eg3.Project;

public class Employee extends Person 
{	
	private String designation;
	private double salary;
	private Address address;
	private Project project;
	
	public Employee(int id,String name,String designation,double salary) 
	{
		super(id,name);
		this.designation=designation;
		this.salary=salary;
	}

	public String getDesignation() 
	{
		return designation;
	}

	public void setDesignation(String designation) 
	{
		this.designation = designation;
	}

	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	public Address getAddress() 
	{
		return address;
	}

	public void setAddress(Address address) 
	{
		this.address = address;
	}

	public Project getProject() 
	{
		return project;
	}

	public void setProject(Project project) 
	{
		this.project = project;
	}
		
	public void printEmployee() 
	{
		printPerson();
		System.out.println("Designation : "+designation);
		System.out.println("Salary : "+salary);
		address.printAddress();
		project.printProject();
	}
}

//Task - Complete this code Address, Project and Employee
//Create object same as how we did for Player with Team and access it
