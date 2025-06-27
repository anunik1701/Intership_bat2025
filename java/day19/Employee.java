package Day19.java;

public class Employee {
	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("ID:-"+id);
		System.out.println("NAME:-"+name);
		System.out.println("SALARY:-"+salary);
	}
	public static void main(String[] args) 
	{
		
       Employee e =new Employee(101,"ANUSHKA",10000);
       e.display();
	}

}
