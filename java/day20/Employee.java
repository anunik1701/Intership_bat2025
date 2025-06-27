package Day20.java;

public class Employee
{
	int id;
	String name;
	
	Employee(int i,String n)
	{
		id=i;
		name=n;
	}
	Employee(Employee e)
	{
		id=e.id;
		name=e.name;
	}
	void display()
	{
		
		System.out.println("Id:-"+id);
		System.out.println("name:-"+name);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Employee e1= new Employee(01,"ANUSHKA");
		Employee e2  =new Employee(e1);
		
		e1.display();
		e2.display();
	}

}
