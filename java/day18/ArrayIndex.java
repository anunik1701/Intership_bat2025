package Day18.java;

public class ArrayIndex {

	public static void main(String[] args) {
		
		        int[] numbers = {15, 25, 30, 44, 55};

		        try 
		        {
		            System.out.println("Accessing 6th element: " + numbers[2]);
		        } 
		        catch (ArrayIndexOutOfBoundsException e) 
		        {
		            System.out.println("Exception caught ");
		        }
		    }
		}


	


