import java.util.*;


/*
	2) 
	Create a class called Employee that includes three instance variables—a
	first name (type String), a last name (type String) and a monthly salary
	(double). Provide a constructor that initializes the three instance variables.
	Provide a set and a get method for each instance variable. If the monthly
	salary is not positive, do not set its value. Write a test application named
	EmployeeTest that demonstrates class Employee’s capabilities. Create two
	Employee objects and display each object’s yearly salary. Then give each
	Employee a 10% raise and display each Employee’s yearly salary again.

*/

class Employee
{
	String first_name;
	String last_name;
	double salary;
	
	public Employee() {
	
		
	}

	public Employee(String first_name, String last_name, double salary) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary>=0)
			this.salary = salary;
		else
			salary=0;
	}
	
	
	
}

public class EmployyTest {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee("Raman","Rao",100000);
		Employee e2 = new Employee("Shyam","Sundar",50000);
		
		/*
		
		String f_name;
		String l_name;
		double sal;
		
		System.out.println("enter first name of employee: ");
		f_name = sc.next();
		
		System.out.println("enter last name of employee: ");
		l_name = sc.next();
		
		System.out.println("enter salary of employee: ");
		sal = sc.nextDouble();
		
		e1.setFirst_name(f_name);
		e1.setLast_name(l_name);
		e1.setSalary(sal);
		*/
		
		System.out.println("Yearly salary of "+e1.getFirst_name()+" "+e1.getLast_name()+" is Rs "+(12*e1.getSalary()));
		
		System.out.println("Yearly salary of "+e2.getFirst_name()+" "+e2.getLast_name()+" is Rs "+(12*e2.getSalary()));
		
		System.out.println();
		
		System.out.println("**************** After 10% increment ************");
		
		System.out.println();
		
		
		
		System.out.println("Yearly salary of "+e1.getFirst_name()+" "+e1.getLast_name()+" is Rs "+(12*(e1.getSalary() +(e1.getSalary()*0.1))));
		
		System.out.println("Yearly salary of "+e2.getFirst_name()+" "+e2.getLast_name()+" is Rs "+(12*(e2.getSalary() +(e2.getSalary()*0.1))));
	}

}
