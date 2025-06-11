package Day8leap.java;

import java.util.Scanner;

public class Evenodd8 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("enter the number:-");
		int num =s.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num + "num is even");
			
		}
		else
		{
			System.out.println(num +"num is odd");
		}
		
		
		

	}

}
