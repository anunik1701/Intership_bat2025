package Day19.java;

public class Counter {
	static int count =0;
	Counter()
	{
		count++;
		System.out.println("object number:-"+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter c1= new Counter();
		Counter c2= new Counter();
		Counter c3= new Counter();

		
	}

}
 