package Day17.java;
import java.util.Scanner;
public class Arithematic {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		        try 
		        {
		            System.out.print("Enter first number: ");
		            int x = sc.nextInt();
		            System.out.print("Enter second number: ");
		            int y = sc.nextInt();

		            int division = x / y;
		            System.out.println("Result: " + division);
		        }
		        catch (ArithmeticException e) 
		        {
		            System.out.println("Arithmetic Exception: " + e.getMessage());
		        }
		    }
		}


	


