package eg3;

//import eg3.Employee;
//import eg3.Address;
//import eg3.Project;

public class Main {

	public static void main(String[] args) 
	{
		Address a1=new Address(1000,"BVP","Pune","Maharashtra", 411046);		
		Employee e1 = new Employee(100, "Tanmay", "Full Stack Developer", 1000000);
		Project p1=new Project(11,"Revature");
		e1.setAddress(a1);
		e1.setProject(p1);
		System.out.println("Printing details of employee "+e1.getName());
		e1.printEmployee();
		
		Address a2=new Address(1001,"Katraj","Pune","Maharashtra", 411047);
		Employee e2 = new Employee(101, "Sanket", "Java Full Stack Developer", 2000000);
		Project p2=new Project(12,"Infosys");
		e2.setAddress(a2);
		e2.setProject(p2);
		System.out.println("\nPrinting details of Employee "+e2.getName());
		e2.printEmployee();
		
		Address a3=new Address(1002,"Narhe","Pune","Maharashtra", 411048);
		Employee e3 = new Employee(102, "Soham", "Python Developer", 3000000);
		Project p3=new Project(13,"Accenture");
		e3.setAddress(a3);
		e3.setProject(p3);
		System.out.println("\nPrinting details of Employee "+e3.getName());
		e3.printEmployee();

	}

}

