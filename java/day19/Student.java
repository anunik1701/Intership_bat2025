package Day19.java;

public class Student 
{
	String name;
	int m1,m2,m3;
	Student(String name,int marks1,int marks2,int marks3)
	{
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	void display()
	{
		int total=m1+m2+m3;
		double perc=total/3.0;
		System.out.println("NAME:-"+name);
		System.out.println("PERCENTAGE:-"+perc);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student s=new Student ("ANUSHKA",52,78,98);
		s.display();

	}

}
