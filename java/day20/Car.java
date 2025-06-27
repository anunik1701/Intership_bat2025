package Day20.java;

public class Car
{
	String brand;
	int price;
	
	Car(String b,int p)
	{
		brand=b;
		price=p;
	}
	Car(Car c)
	{
		brand=c.brand;
		price=c.price;
	}
	void display()
	{
		System.out.println("Brand:-"+brand);
		System.out.println("Price:-"+price);
	}
		public static void main(String[] args)
		{
		// TODO Auto-generated method stub
			
			Car c1=new Car("MG",120000);
			Car c2=new Car(c1);
			
			c1.display();
			c2.display();

	}

}
