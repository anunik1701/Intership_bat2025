package Swapping.java;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20,b=45;
		
		System.out.println("before the swapping  a="+a + ",b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("after the swapping a="+a + ",b="+b);
	}

}
