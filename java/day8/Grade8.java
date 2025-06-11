package Day8leap.java;
import java.util.Scanner;

public class Grade8 {

	public static void main(String[] args) {
		
		System.out.println("enter the grade:-");
		Scanner s=new Scanner(System.in);
		String grade =s.nextLine();
		switch(grade)
		{
		case "A":System.out.println("EXCELLENT");
		break;
		case "B":System.out.println("GOOD");
		break;
		case "C":System.out.println("AVERAGE");
		break;
		case "D":System.out.println("BELOW AVGRAGE");
		break;
		case "F":System.out.println("FAIL");
		break;
		default:System.out.println("INVALID CASE.....!!!!");
		
		
		
		
		
	
		}
		

	}

}
