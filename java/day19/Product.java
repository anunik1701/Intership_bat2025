package Day19.java;

public class Product  
{
	int id;
	String name;
	double price;
	
	Product()
	{
		id=1;
		name="WWW";
		price=3200;
	}
	
	Product(int id,String name)
	{
		this.id=id;
		this.name=name;
		this.price=3400;
	}
	
	Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	
	}
	void display()
	{
		System.out.println("ID:-"+id);
		System.out.println("NAME:-"+name);
		System.out.println("PRICE:-"+price);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Product p1=new Product();
        Product p2=new Product(2,"RRR");
        Product p3=new Product(3,"qqq",3600);
        p1.display();
        p2.display();
        p3.display();
		
	}

}
