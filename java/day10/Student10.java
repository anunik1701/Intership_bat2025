package Day10.java;

public class Student10 {
	String name;
	int age;
	
	Student10(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("age:-"+age);
	}
	
	public static void main(String[] args)
	{
		Student10 s1 = new Student10("ANUSHKA",20);
		s1.display();
		
	}

}
