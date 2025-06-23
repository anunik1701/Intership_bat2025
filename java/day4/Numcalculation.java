package Numcal.java;

import java.util.Scanner;

public class Numcalculation {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

          
          System.out.print("Enter the first  number: ");
          int num1= sc.nextInt();
          
          System.out.print("Enter the second  number: ");
          int num2= sc.nextInt();
          
          System.out.print("Enter the third number: ");
          int num3= sc.nextInt();
          
          int total=num1+num2+num3;
          float avg=(total)/3;
          
          
          System.out.println("total is :"+total);
          System.out.println("average is::"+avg);
          
          
          
          

	}

}
