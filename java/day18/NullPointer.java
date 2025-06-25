package Day18.java;

public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str = null;

		        try
		        {
		            System.out.println("String length: " + str.length());
		        } 
		        catch (NullPointerException e) 
		        {
		            System.out.println("Caught NullPointerException" );
		        }
		    }
		}


	

