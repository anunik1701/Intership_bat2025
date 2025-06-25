package Day18.java;
import java.io.*;

public class File {

	
		    public static void main(String[] args) {
		        try 
		        {
		            FileReader fr = new FileReader("data.txt");
		            BufferedReader br = new BufferedReader(fr);
		            String line;
		            while ((line = br.readLine()) != null) {
		                System.out.println(line);
		            }
		            br.close();
		        }
		        catch (FileNotFoundException e) 
		        {
		            System.out.println("FileNotFoundException: File not found.");
		        } catch (IOException e) {
		            System.out.println("IOException while reading the file ");
		        }
		    }
		}


	


