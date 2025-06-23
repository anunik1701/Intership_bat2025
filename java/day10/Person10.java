package Day10.java;

public class Person10 
{
	String name;
	int age;
	
	Person10(String name,int age)
	{
		System.out.println("name:-"+name+",age:-"+age);
		
	}
}
class Employee extends Person10
{
	double salary;
	Employee(String name,int age,double salary)
	{
		super(name,age);
		this.salary =salary;
	}
	void displayEmployeeInfo()
	{
		display.Person10Info();
		System.out.println("salary:-"+salary);
	}
}


