package Day20.java;

public class Person 
{
	String name;
	int age;
	
	Person()
	{
		name ="ANUSHKA";
		age =18;
	}
	void display()
	{
		System.out.println("NAME IS:-"+name);
		System.out.println("AGE IS:-"+age);
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Person p =new Person();
		p.display();
	}

}
