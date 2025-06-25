package Day18.java;
import java.io.*;

public class IO1{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 try
		 {
		            FileReader reader = new FileReader("nonexistent.txt");
		            BufferedReader br = new BufferedReader(reader);
		            String line = br.readLine();
		            System.out.println(line);
		            br.close();
		   }
		 catch (IOException e) 
		 {
		            System.out.println("IOException caught ");
		       }
		    }
		}


	

