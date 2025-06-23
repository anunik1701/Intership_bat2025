package Day9.java;

import java.util.Scanner;

public class Logical9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a age of person: ");
        int age= sc.nextInt();
        
		
	
		
		if(age>=60 || age<12) 
		{
			System.out.println("the person is citizen ...");
			
		}
		else
		{
			System.out.println("the person is a child....!!!1");
		}

	}

}
