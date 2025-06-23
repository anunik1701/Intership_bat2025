package Agecheck.java;

import java.util.Scanner;

public class AgeDemo {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the name of student :");
		String name= sc.next();
		System.out.println("enter the age of student :");
		int age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("you are eligible for voting...!!!");
			
		}
		else
		{
			System.out.println("not allowd for voting \n try next time...!!");
		}

	}

}
