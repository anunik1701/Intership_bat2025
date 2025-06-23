package Day9.java;

import java.util.Scanner;

public class Swapping9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a  first number: ");
        int a= sc.nextInt();

        System.out.print("Enter a  second number: ");
        int b= sc.nextInt();
        
		System.out.println("Before swapping the value of\n a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After the swapping the value of\n a="+a+" b="+b);
		
		

	}

}
