package Day20.java;

public class Student {
	
	int id;
	String name;
	double mark;
	
	Student(int id,String name,double mark)
	{
		this.id=id;
		this.name=name;
		this.mark=mark;
	}
	void display()
	{
		System.out.println("Id:-"+id);
		System.out.println("NAME:-"+name);
		System.out.println("MARK :-"+mark);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Student s= new Student(101,"ANUSHKA",78);
		s.display();
	}

}
