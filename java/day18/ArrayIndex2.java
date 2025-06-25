package Day18.java;

public class ArrayIndex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] array = {11, 22, 33, 46, 75};

		        try
		        {
		            for (int i = 0; i <= array.length; i++) {
		                System.out.println("Element at index " + i + ": " + array[i]);
		            }
		        }
		        catch (ArrayIndexOutOfBoundsException e)
		        {
		            System.out.println("Exception caught while accessing array" );
		        }
		    }
		}


	


