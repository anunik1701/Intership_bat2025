package Day8leap.java;
import java.util.Scanner;

public class leap8 {

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	
	System.out.println("enter the year:-");
	int year =s.nextInt();
	
	if((year % 4 ==0 && year % 100!=0) || (year % 400 == 0))
		
	{
		System.out.println(year +"is a leap year");
		
	}
	else
	{
		System.out.println(year +" is not leap year");
	}
	}

}
