package Day17.java;

import java.util.Scanner;

public class Zeroex {

	public static void main(String[] args) 
	{
         Scanner sc = new Scanner(System.in);

          
          System.out.print("Enter the first  number: ");
          int num1= sc.nextInt();
          
          System.out.print("Enter the second  number: ");
          int num2= sc.nextInt();
          try
		        {
		   
		            int result = num1/num2;
		            System.out.println("Result: " + result);
		        }
		        catch (ArithmeticException e)
		        {
		            System.out.println("Error: Cannot divide by zero.");
		        }
		    }
		}


	


