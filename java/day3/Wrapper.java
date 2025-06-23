package Wrapper1.java;

public class Wrapper {

	public static void main(String[] args) {
		
		        String intStr = "123";
		        String doubleStr = "456.78";

		        // Converting String to Integer
		        int intValue = Integer.parseInt(intStr);
		        System.out.println("Integer value: " + intValue);

		        // Converting String to Double
		        double doubleValue = Double.parseDouble(doubleStr);
		        System.out.println("Double value: " + doubleValue);

		        // Converting String to Float
		        float floatValue = Float.parseFloat(doubleStr);
		        System.out.println("Float value: " + floatValue);
		    
		}

}
