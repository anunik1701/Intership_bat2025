package Day8leap.java;
import java.util.Scanner;

public class Signal8 {

	public static void main(String[] args) {
		

		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a traffic light color (Red, Yellow, Green): ");
		        String color = scanner.next().toLowerCase();

		        switch (color) {
		            case "red":
		                System.out.println("STOP");
		                break;
		            case "yellow":
		                System.out.println("READY TO GO");
		                break;
		            case "green":
		                System.out.println("GO");
		                break;
		            default:
		                System.out.println("Invalid input! Please enter Red, Yellow, or Green.");
		        }

		      
		    }
		}


	


