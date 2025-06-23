package Logical1.java;

import java.util.Scanner;

public class Logic {

	public static void main(String[] args) {
		 
		System.out.println("enter the marks:");
		Scanner sc=new Scanner(System.in);
	    int marks =sc.nextInt();
	    
	    if(marks>40)
	    {
	    	System.out.println("student has passed the exam..!!\n CONGRATES..!!!");
	    	
	    }
	    else
	    {
	    	System.out.println("student has failed\n try again....");
	    }

	}

}
