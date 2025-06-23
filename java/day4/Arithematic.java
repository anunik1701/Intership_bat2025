package Arithematic1.java;

import java.util.Scanner;

public class Arithematic {

	public static void main(String[] args) {

		    System.out.println("enter the two numbers:");
		    Scanner sc=new Scanner(System.in);
		    int a=sc.nextInt();
		    
		    Scanner s=new Scanner(System.in);
		    int b=sc.nextInt();
		    
		    
		    System.out.println("addition is:"+(a+b));
		    System.out.println("substraction is:"+(a-b));
		    System.out.println("multiplication is :"+(a*b));
		    System.out.println("division is:"+(a/b));
		    System.out.println("mod is:"+(a%b));
	}
}