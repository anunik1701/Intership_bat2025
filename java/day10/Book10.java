package Day10.java;

public class Book10 {
	String title;
	String author;
	
	Book10(String t ,String a)
	{
		title = t;
		author =a ;
		
	}
	void display()
	{
		System.out.println("Title:-"+title +",\nauthor:-"+author);
		
	}
	
	public static void main(String[] args)
	{
		Book10 b1= new Book10("2007","Wings of fire");
		Book10 b2 = new Book10("8521","the god of small things");
		
		b1.display();
		b2.display();
	
	}

}
