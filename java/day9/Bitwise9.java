package Day9.java;

import java.util.Scanner;

public class Bitwise9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a  first number: ");
        int num1= sc.nextInt();

        System.out.print("Enter a  second number: ");
        int num2= sc.nextInt();
        
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        
        System.out.println("after swapping the value ofn num1="+num1 +"num2="+num2);
        
        

	}

}
